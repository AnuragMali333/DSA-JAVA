import java.util.Scanner;

public class lowerBound2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int []arr={10,20,30,30,40,50,60,70};
    System.out.print("Enter target:");
    int target=sc.nextInt();

    int lo=0;
    int hi=arr.length-1;
    int lowerBound=arr.length;

    while (lo<=hi) {
      int mid=(lo+hi)/2;

      if(arr[mid]>=target){
        lowerBound=Math.min(mid, lowerBound);
        hi=mid-1;
      }
      else{
        lo=mid+1;
      }
    }
    System.out.println("LowerBound is :"+lowerBound);
  }
}
