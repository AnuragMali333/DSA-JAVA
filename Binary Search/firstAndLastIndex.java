public class firstAndLastIndex {
  public static void main(String[] args) {
    int[] nums = { 10, 20, 30, 30, 40, 50, 60, 70 };
    int lo = 0;
    int hi = nums.length - 1;
    int lb = nums.length;
    int target=30;

    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] >= target) {
        lb = mid;
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
    }

    if (lb > nums.length - 1 || nums[lb] != target) {
      System.out.println("-1 , -1");
    }
    // If Target if present in array calculate its upperbound
    lo = 0;
    hi = nums.length - 1;
    int ub = nums.length;

    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] > target) {
        ub = mid;
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
    }

    System.out.println(lb+" "+(ub-1));

  }
}
