import java.util.Scanner;

public class productOfArray {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of array:");
    int size=sc.nextInt();

    int[]arr=new int[size];

    for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter "+(i)+" ele:");
      arr[i]=sc.nextInt();
    }

    long prod=1;

    for (int i = 0; i < arr.length; i++) {
      prod*=arr[i];
    }

   System.out.println("The product of all ele is "+(prod)); 
  }
}
