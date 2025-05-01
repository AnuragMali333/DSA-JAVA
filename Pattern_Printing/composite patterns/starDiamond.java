import java.util.Scanner;

public class starDiamond {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the no of rows:");
    int rows=sc.nextInt();

    int mid =(rows/2)+1;
    int leftl=mid-1;
    int rightl=mid+1;

    for(int i=1;i<=rows;i++){
      for( int j=1;j<=rows;j++){
        if(j<=leftl || j>=rightl){
          System.out.print("  ");
        }
        else{
          System.out.print("* ");
        }
      }
      System.out.println();

      if(i<mid){
        leftl--;
        rightl++;
      }
      else{
        leftl++;
        rightl--;
      }
    }
  }
}
