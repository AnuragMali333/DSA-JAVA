public class peakIndexInMountainArray {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 4, 7, 8, 6, 3, 2 };

    int lo = 1;
    int hi = arr.length - 2;
    int peak = -1;

    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;

      if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) { // mid is Peak
        peak = mid;
        break;
      } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) { // mid is in increasing part
        lo = mid + 1;
      } else if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) { // mid is in decreasing part
        hi = mid - 1;
      }
    }
    System.out.println(peak);
  }
}
