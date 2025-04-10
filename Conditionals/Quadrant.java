import java.util.Scanner;

public class Quadrant {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter x coordinate: ");
    int x = sc.nextInt();

    System.out.print("Enter y coordinate: ");
    int y = sc.nextInt();

    if (x == 0 && y == 0) {
      System.out.println("Point is origin");
    } else if (y == 0 & x != 0) {
      System.out.println("Point lies on x axis");
    } else if (x == 0 & y != 0) {
      System.out.println("Point lies on y axis");
    } else if (x > 0 & y > 0) {
      System.out.println("Point is in 1st quadrant");
    } else if (x < 0 & y > 0) {
      System.out.println("Point is in 2nd quadrant");
    } else if (x < 0 & y < 0) {
      System.out.println("Point is in 3rd Quadrant");

    } else {
      System.out.println("Point is in 4th quadrant");
    }
  }
}
