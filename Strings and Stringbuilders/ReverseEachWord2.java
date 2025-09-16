import java.util.Scanner;

public class ReverseEachWord2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    StringBuilder sb=new StringBuilder(sc.nextLine());
    int start;

    for (int i = 0; i < sb.length(); i++) {
      if(sb.charAt(i)==' '){
        continue;
      }
      else if(sb.charAt(i)!=' '){
        start=i;
        while( i<sb.length()&& sb.charAt(i)!=' '){
          i++;
        }
        ReverseEachWord(sb, start, i-1);
      }
    }
    System.out.println(sb);
    
  }

  public static void ReverseEachWord(StringBuilder sb , int begin, int finish){
    for (int i = begin; i < finish; i++) {
      char temp=sb.charAt(i);
      sb.setCharAt(i, sb.charAt(finish));
      sb.setCharAt(finish, temp);
      finish--;
    }
  }
}
