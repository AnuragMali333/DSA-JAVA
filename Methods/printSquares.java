import java.util.Scanner;

public class printSquares {
  public static void Squares(int x){
    for(int i=1;i<=x;i++){
      int square=i*i;
      System.out.println("Square of "+i+" is: "+square);
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n=sc.nextInt();
    Squares(n);


  }
}
