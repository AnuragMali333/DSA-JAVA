import java.util.Scanner;

public class BinaryTriangle {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no of rows:");
    int rows=sc.nextInt();
    for(int i=1;i<=rows;i++){
     if(i%2==1){ // odd rows
      int bin=1;
      for(int j=1;j<=i;j++){
        System.out.print(bin);
        bin=(bin==1) ? 0 :1;
      }
      System.out.println();
     }
     else{ // even rows
      int bin=0;
      for(int j=1;j<=i;j++){
        System.out.print(bin);
        bin=(bin==1) ? 0 :1;
      }
      System.out.println();
     }
     
    }
  }
}
// System.out.print(bin);
