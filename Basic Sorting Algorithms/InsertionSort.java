public class InsertionSort {
  public static void main(String[] args) {
    int []arr={10,-4,20,7,-6,8};
    print(arr);

    for (int i = 1; i < arr.length; i++) {// n-1 passes
      for (int j = i; j > 0; j--) {
          if(arr[j]<arr[j-1]){
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
          }  
          else{
            break;
          }      
      }
      print(arr);
    }
  }

  public static void print(int[]arr){
    for (int i : arr) {
      System.out.print(i+" ");
    }
    System.out.println();
  }
}
