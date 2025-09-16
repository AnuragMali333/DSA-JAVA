import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sortString {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String s=sc.nextLine();// input string
    char[]arr=s.toCharArray(); // convert it to char array

    for (char c : arr) {
      System.out.print(c);
    }
    System.out.println();
    
    Arrays.sort(arr); // sort array

    for (char c : arr) {
      System.out.print(c);
    }
    System.out.println();
    
  }
  
}