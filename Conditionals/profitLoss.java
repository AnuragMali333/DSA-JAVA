import java.util.Scanner;

public class profitLoss {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter cost price of item: ");
    double cp=sc.nextDouble();
    System.out.print("Enter selling price of item: ");
    double sp=sc.nextDouble();

    int difference=(int)(sp-cp);

    if(difference>0){
      System.out.println("Profit is: "+difference);
    }
    else if(difference==0){
      System.out.println("There was no profit nor loss");
    }
    else{
      System.out.println("Loss is: "+(-difference));
    }
    
  }
}
