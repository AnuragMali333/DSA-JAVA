import java.util.Scanner;

public class areaOfCircleInput {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the radius: ");
    double r = sc.nextDouble();
    System.out.print("The area is: "+(3.14*r*r));
  }
}
