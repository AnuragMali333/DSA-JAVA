import java.util.Scanner;

public class ReverseEachWord {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    StringBuilder sb=new StringBuilder("i am anurag mali.");
    int start=0; 
    int end;

     for(int i=0;i<sb.length();i++){
      if(sb.charAt(i)==' '|| sb.charAt(i)=='.'){
        end=i-1;
        ReversePassedWord(sb,start,end);
        start=i+1;
      }
     }

     System.out.println(sb);

  }
  public static void ReversePassedWord( StringBuilder sb, int begin , int finish){
      for(int i=begin;i<finish;){
        char temp=sb.charAt(i);
        sb.setCharAt(i, sb.charAt(finish));
        sb.setCharAt(finish, temp );
        i++;finish--;
      }
    }
}
