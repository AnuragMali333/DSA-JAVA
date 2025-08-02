import java.util.Scanner;
//This is not actual updation we are basically creting a new string as strings in java are immutable.
public class UpdateString {
 public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
  System.out.print("Enter your string: ");
  String s=sc.nextLine();
  String t=new String("");

  for (int i = 0; i < s.length(); i++) {
    if(i%2==0){
      t+="a";
    }
    else{
      t+=s.charAt(i);
    }
  }
  s=t;
  System.out.println(s);
 } 

 
}
