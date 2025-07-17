public class mergeSortedArrays {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 7 };
    int[] brr = { 0, 2, 6, 8, 9 };

    int n = arr.length + brr.length;// n=9
    int[] crr = new int[n];

    int i = 0, j = 0, k = 0;

    while (i < arr.length && j < brr.length) { // until either of array is finished
      if (arr[i] < brr[j]) {
        crr[k] = arr[i];
        i++;
      } else if (arr[i] > brr[j]) {
        crr[k] = brr[j];
        j++;
      }
      k++;
    }

    while (i < arr.length) {
      crr[k++] = arr[i++];
    }

    while (j < brr.length) {
      crr[k++] = brr[j++];
    }

    for (int ele : crr) {
      System.out.print(ele + " ");
    }
  }
}
