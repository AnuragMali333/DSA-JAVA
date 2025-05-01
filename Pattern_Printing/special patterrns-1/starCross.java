import java.util.Scanner;

public class starCross {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no of rows:");
    int rows=sc.nextInt();
    int k=rows;
    for(int i=1;i<=rows;i++){
      for(int j=1;j<=rows;j++){
       if(i==j || j==rows-i+1){
          System.out.print("*");
       }
       else{
        System.out.print("  ");
       }
      }
      System.out.println();
    }
    
  }
}
