public class SquareRoot2 {
  public static void main(String[] args) {
    int x=8;
    int lo = 0;
    int hi = x;
    int lb = x;

    if (x == 0 || x == 1) {
      System.out.println(x);
    }

    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      long sqr = (long) mid * mid;

      if (sqr > x) {
        lb = mid;
        hi = mid - 1;
      } else if (sqr == x) {
        lb = mid;
        System.out.println(lb);
      } else {
        lo = mid + 1;
      }
    }
    System.out.println(lb-1);
  }
}
