import java.util.Scanner;

public class squarePattern {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of side :");
    int length=sc.nextInt();

    for (int i=1;i<=length;i++){
      for(int j=1;j<=length;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
