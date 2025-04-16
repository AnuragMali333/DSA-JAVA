import java.util.Scanner;

public class digitsAndSquare {
  public static void digitsOfaNumWithSquare(int num){
    int saveNum=num;
    int square=num*num;
    int digits=0;
    while (num!=0) {
      num/=10;
      digits++;
    }
   
    System.out.println("The square of number "+(saveNum)+" is: "+square+" and it is a "+digits+" digit number." );
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num=sc.nextInt();
    int saveNum=num;
    digitsOfaNumWithSquare(num);
  }
}
