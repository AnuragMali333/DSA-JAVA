public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = { 8,7,6,5,4,3,2,1 };
    print(arr);
    for (int k = 0; k < arr.length - 1; k++) {
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
      print(arr);
    }
  }

  public static void print(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
