import java.util.Scanner;

public class starPlus {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the no of rows(odd no):");
    int rows=sc.nextInt();
    int columns=rows;
    int middlerow=(rows/2)+1;
    int middlecolumn=middlerow;
    for(int i=1;i<=rows;i++){
     for(int j=1;j<=columns;j++){
      if(i==middlerow || j==middlecolumn){
        System.out.print("*"+" ");
      }
      else{
        System.out.print("  ");
      }
     }
     System.out.println();
    }
  }
}
