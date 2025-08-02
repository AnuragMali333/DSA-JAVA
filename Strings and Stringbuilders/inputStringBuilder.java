import java.util.Scanner;

public class inputStringBuilder {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  StringBuilder sb =new StringBuilder(sc.nextLine());

  sb.setCharAt(0, 'A');
  System.out.println(sb);
 } 
}
