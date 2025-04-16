import java.util.Scanner;

public class digitsOfaNumber2 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter number: ");
    int num=sc.nextInt();

    int digits=0;

    while(num!=0){
      num/=10;
      digits++;

    }

    System.out.println("Number has "+digits+" digits");
  }
}
