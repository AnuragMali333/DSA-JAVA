public class sort0sand1sand2s { // Dutch National Flag Algorithm
  public static void main(String[] args) {
    int[]arr={0,1,2,0,1,2,1,2,0,0};
    int n=arr.length;

    int low=0;
    int high=n-1;

    for(int mid=0;mid<=high;){
      if(arr[mid]==0){
        swap(arr, low, mid);
        low++;mid++;

      }
      else if(arr[mid]==1){
        mid++;
      }
      else{
        swap(arr, high, mid);
        high--;
      }

    }
    for (int i : arr) {
      System.out.print(i+" ");
    }
  }
  public static void swap(int[]arr,int a,int b){
    int temp;
    temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
  }
}
