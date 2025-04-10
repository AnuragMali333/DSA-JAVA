import java.util.Scanner;

public class compareAreaAndPerimeter {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter length: ");
    int length=sc.nextInt();
    System.out.print("Enter breadth: ");
    int breadth=sc.nextInt();

    double perimeter=2*(length+breadth);
    double area=length*breadth;

    if(perimeter>area){
      System.out.println("Perimeter is greater than area");
    }
    else if(perimeter==area){
      System.out.println("Perimeter and area are equal");
    }

    else{
      System.out.println("Area is greater than perimeter");
    }
  }
}
