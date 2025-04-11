import java.util.Scanner;

public class geometricProgression {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of terms");
    int n=sc.nextInt();
    int a=3;
    int r=4;

    for(int i=1;i<=n;i++){
      System.out.println(a);
      a*=r;
    }
  }
}
