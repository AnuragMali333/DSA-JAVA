import java.util.Scanner;

public class absoluteNumber {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number=sc.nextInt();

    if(number>=0){
      System.out.println(number);
    } else{
      System.out.println(-number);
    }
  }
}
