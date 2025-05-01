import java.util.Scanner;

public class alphabetSquare {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length:");
    int length=sc.nextInt();
    
    for(int i=1;i<=length;i++){
      for(int j=1;j<=length;j++){
        char character = (char) (j+64);
        System.out.print(character+" ");
      }

      System.out.println();
    }
  }
}
