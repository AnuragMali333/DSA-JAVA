import java.util.Scanner;

public class compositeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    boolean isPrime=true;

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        System.out.println(num + " is a composite number as it is divisble by " + i);
        isPrime=false;
        break;
      }
    }
    if(num==1){
      System.out.println("Neither Prime nor composite");
    }
    else if(isPrime==true){
      System.out.println(num+" is a prime number");
    }
  }
}
