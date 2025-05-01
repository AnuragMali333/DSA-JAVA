import java.util.Scanner;

public class OddNumberTriangle {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("enter the no of rows:");
    int rows=sc.nextInt();

    // for(int i=1;i<=rows;i++){
    //   int k=1;
    //   for(int j=1;j<=i;j++){
    //     System.out.print(k+" ");
    //     k+=2;
    //   }
    //   System.out.println();
    // }

    for(int i=1;i<=rows;i++){
      for(int j=1;j<=i;j++){
        System.out.print(2*j-1);
      }
      System.out.println();
    }
  }  
}
