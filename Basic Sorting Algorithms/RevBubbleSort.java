public class RevBubbleSort {
  public static void main(String[] args) {
    int []arr={3,1,2,5,4};
    print(arr);

    for (int i = 0; i < arr.length-1; i++) { // n-1 times
      boolean flag=true;
      for (int j = 0; j < arr.length-1-i; j++) {
        if(arr[j]<arr[j+1]){
          int temp=arr[j+1];
          arr[j+1]=arr[j];
          arr[j]=temp;
          flag=false;
        }
      }
       print(arr);
      if(flag==true){
          break;
        }
     
    }

  }

  public static void print(int[]arr){
    for (int i : arr) {
      System.out.print(i+" ");
    }
    System.out.println();
  }
}
