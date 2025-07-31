import java.util.Scanner;
public class countVowels {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your string :");
    String str=sc.nextLine();
    str=str.toLowerCase();
    System.out.println(str);
    int vowels=0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        vowels++;
      }
    }

    System.out.println("String contains "+vowels+" vowels");
  }
}
