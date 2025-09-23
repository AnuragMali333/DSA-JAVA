public class SelectionSort {
  public static void main(String[] args) {
    int[]arr={10,-4,20,1,8,-6};
    print(arr);

    for (int i = 0; i < arr.length-1; i++) { // n-1 passes
      int minIndex=i;
      for (int j =i ; j < arr.length; j++) { // find index of minimum element in the unsorted part
        if(arr[j]<arr[minIndex]){
          minIndex=j;
        }
      }
      int temp=arr[i]; // swap the found minimum with the first element of the unsorted part
      arr[i]=arr[minIndex];
      arr[minIndex]=temp;
      print(arr); //print array after each pass
    }
  }

  public static  void print(int []arr){
    for (int i : arr) {
      System.out.print(i+" ");
    }
    System.out.println();
  }
}
