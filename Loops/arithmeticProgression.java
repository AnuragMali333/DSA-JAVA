import java.util.Scanner;

public class arithmeticProgression {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the value of n:");
    int n=sc.nextInt();
    int a=5 ,d=-4;

    for(int i=1;i<=n;i++){
      System.out.println(a);
      a+=d;
    }
  }
}
