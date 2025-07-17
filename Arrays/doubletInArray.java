import java.util.Scanner;

public class doubletInArray {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of array:");
    int n=sc.nextInt();

    int[]arr=new int[n];
    boolean found=false;

    for (int i = 0; i < n; i++) {
      System.out.print("Enter ele at "+i+" index:");
      arr[i]=sc.nextInt();
    }
    System.out.println();

    System.out.print("Enter the sum:");
    int sum=sc.nextInt();

    for (int i = 0; i < arr.length; i++) {
      int target=sum-arr[i];

      for (int j = i+1; j < arr.length; j++) {
        if (arr[j]==target) {
          found=true;
          System.out.println("["+i+","+j+"]");
        }
      }
    }
    if(found==false){
      System.out.println("No doublet found in array");
    }
  }
}
