import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter length of side 1: ");
    int l1=sc.nextInt();
    System.out.print("Enter length of side 2: ");
    int l2=sc.nextInt();
    System.out.print("Enter length of side 3: ");
    int l3=sc.nextInt();

    if((l1+l2>l3)&&(l2+l3>l1)&&(l1+l3>l2)){
      System.out.println("They can be sides of a triangle ");
    }
    else{
      System.out.println("They cannot be sides of a triangle");
    }

  }
}
