import java.util.Scanner;

public class numberTriangle {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the num of rows:");
    int rows=sc.nextInt();

    for(int i=1;i<=rows;i++){
      for(int j=1; j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
