public class SquareRoot {
  public static void main(String[] args) {
    int x= 82;
    if(x<2){
      System.out.println(x);
    }

    int lo=1;
    int hi=x/2;
    int ans=0;
    while (lo<=hi) {
      int mid=lo+(hi-lo)/2;

      if(mid>x/mid){
        hi=mid-1;
      }
      else {
        ans=mid;
        lo=mid+1;
      }
    }

    System.out.println(ans);
  }
}
