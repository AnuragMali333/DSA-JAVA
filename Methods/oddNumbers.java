import java.util.Scanner;

public class oddNumbers {
  public static void printOddNums(int x,int y){
    for(; x<=y; x++){
      if(x%2==1) {
        System.out.println(x);
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1=sc.nextInt();

    System.out.print("Enter second number: ");
    int num2=sc.nextInt();

    printOddNums(num1, num2);
  }
}
