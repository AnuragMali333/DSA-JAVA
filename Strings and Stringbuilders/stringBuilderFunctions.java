import java.util.Scanner;

public class stringBuilderFunctions {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    StringBuilder sb=new StringBuilder("raghav");
    StringBuilder tb=new StringBuilder("madhav");

    System.out.println(sb.compareTo(tb));
    System.out.println(sb.reverse());

    StringBuilder kb= new StringBuilder(sc.nextLine());
  }
}
