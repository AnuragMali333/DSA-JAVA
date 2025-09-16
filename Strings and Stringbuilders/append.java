import java.util.Scanner;

public class append {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb=new StringBuilder("Abc");
    sb.append(35);
    System.out.println(sb);

    sb.append('*');
    System.out.println(sb);

    sb.append("mak");
    System.out.println(sb);

    char[] ch={'l','m','n'};
    sb.append(ch);
    System.out.println(sb);

    /*int[] arr={1,2,3,4,5,6};
    sb.append(arr);
    System.out.println(sb); // does not work address gets appended.*/

    StringBuilder s=new StringBuilder("UIO");
    sb.append(s);
    System.out.println(sb);
     
  }
}
