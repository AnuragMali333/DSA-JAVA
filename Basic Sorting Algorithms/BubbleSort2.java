public class BubbleSort2 {
  public static void main(String[] args) {
    int[] arr = { 2,1,4,3,5,6,7,8 };
    print(arr);

    for (int k = 0; k < arr.length - 1; k++) {
      for (int i = 0; i < arr.length - 1-k; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
      print(arr);
      if(checkIfSorted(arr)){
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

  public static boolean checkIfSorted(int[]arr){ 
    for (int i = 0; i < arr.length-1; i++) {
      if(arr[i]>arr[i+1]){
        return false;
      }
    }
    return true;
  }
}
