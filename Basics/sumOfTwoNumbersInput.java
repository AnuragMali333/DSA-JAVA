import java.util.Scanner;

public class sumOfTwoNumbersInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    double num1=sc.nextDouble();
    System.out.print("Enter second number: ");
    double num2=sc.nextDouble();

    System.out.print("The sum is: "+(num1+num2));
  }
}
