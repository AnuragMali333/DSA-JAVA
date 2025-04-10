import java.util.Scanner;

public class threeDigitNumber {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number=sc.nextInt();

    if((number>99)&&(number<1000)){
      System.out.println("It is a three digit number");
    }
    else{
      System.out.println("It is not a three digit number");
    }
  }
}
