// Sort a given array in increasing order using selection sort,but in each pass,put the kth 
//maximum element at its right position

public class hw2 {
  public static void main(String[] args) {
    int[] arr = { 3, 1, 2, 5, 4 };

    for (int i = 0; i < arr.length - 1; i++) { // n-1 iterations
      int maxIndex = 0;
      for (int j = 0; j < arr.length - i; j++) { // find index of ele with max value from unsorted part
        if (arr[j] > arr[maxIndex]) {
          maxIndex = j;
        }
      }
      int temp = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = arr[maxIndex];
      arr[maxIndex] = temp;
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
