public class BubbleSortOptimized {
 public static void main(String[] args) {
    int[] arr = { 3,1,5,3,4 };
    print(arr);

    for (int k = 0; k < arr.length - 1; k++) {
      boolean flag=true; 
      for (int i = 0; i < arr.length - 1-k; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          flag=false;
        }
      }
      print(arr);
      if(flag==true){ // Running an extra pass is better than running a extra loop everytime to check if its sorted.
        break;
      }
     
    }
  }

   public static void print(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
