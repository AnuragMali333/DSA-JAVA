import java.util.Scanner;

public class NumberPyramidPalindrome {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the no of rows:");
    int rows=sc.nextInt();

    for(int i=1;i<=rows;i++){
      for(int j=1;j<=rows-i;j++){
        System.out.print(" ");
      }
      int k=1; int l=i-1;
      for(int j=1;j<=2*i-1;j++){
        if(j<=i){ 
          System.out.print(k);
          k++;
        }
        else{
          System.out.print(l);
          l--;
        }
      }
      System.out.println();
    }
  }
}
