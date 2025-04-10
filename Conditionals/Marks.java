import java.util.Scanner;

public class Marks {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the marks: ");
    int n=sc.nextInt();

    if(n>=81){
      System.out.println("Very good");
    }
    else if(n>=61){
      System.out.println("Good");
    }
    else if(n>=41){
      System.out.println("Average");
    }
    else{
      System.out.println("Fail");
    }
  }
}
