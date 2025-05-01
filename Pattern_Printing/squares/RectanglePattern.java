import java.util.Scanner;

public class RectanglePattern {

  public static void printRectangle(int rows,int columns){
    for(int i=1;i<=rows;i++){
      for(int j=1;j<=columns;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows=sc.nextInt();
    System.out.print("Enter the number of columns: ");
    int columns=sc.nextInt();

    printRectangle(rows, columns);
  }
}
