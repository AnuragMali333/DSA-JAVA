import java.util.Scanner;

public class DIvisbleBy5or3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number=sc.nextInt();

    if(number%5==0 || number%3==0){
      System.out.println(number+" is divisible by 3 or 5");
    }
    else{
      System.out.println(number+" is not divisible by 3 or 5");
    }
  }
}
