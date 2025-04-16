import java.util.Scanner;

public class DigitsOfANumber {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number: ");
    int num=sc.nextInt();

    int digits=0;
    if(num<0){
      num=-num;
    }
    if (num == 0) {
      System.out.println("Number has 1 digit");
      return;
  }   
    int i=1;
    while(i<=num){
      i*=10;
      digits++;
    }
    
    System.out.println("Number has "+digits+" digits");
  }
}
