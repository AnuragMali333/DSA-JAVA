import java.util.Scanner;

public class alphabetTriangle {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no of rows:");
    int rows=sc.nextInt();

    for(int i=1;i<=rows;i++){
      for(int j=1;j<=i;j++){
        char ch=(char)(j+64);
        System.out.print(ch+" ");
      }
      System.out.println();
    }
  }
}
