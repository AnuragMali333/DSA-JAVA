import java.util.Scanner;

public class sumOfDigits {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    int sum=0;
    if(num<0){
      num=-num;
    }

    while (num!=0) {
      sum+=(num%10);
      num/=10;
    }

    System.out.println("The sum of digits is: "+sum);
  }
}
