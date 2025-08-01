import java.util.Scanner;

public class convertToString {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter integer number:");
    int num=sc.nextInt();
    String s=""+num;
    System.out.println(s);
  }
}
