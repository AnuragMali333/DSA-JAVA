import java.util.Scanner;

public class toggleString {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    StringBuilder s=new StringBuilder(sc.nextLine());

    for (int i = 0; i < s.length(); i++) {
      int ascii=(int) s.charAt(i);
      if(ascii>=65 && ascii<=90){ //Capital letters
        ascii+=32;
      }
      else if(ascii>=97 && ascii<=122){
        ascii-=32;
      }
      s.setCharAt(i, (char)ascii);

    }

    System.out.println(s);
  }
}
