public class equals {
  public static void main(String args[]){
    String s="abcxyz";
    String a="abcxyz";// a points to the same string due to interning
    String b=new String(s);
    String c="abc";
    c+="xyz";

    System.out.println(s==a); // true
    System.out.println(s==b); // false
    System.out.println(s==c); // false
    
    System.out.println(s.equals(b)); // true
    System.out.println(s.equals(c)); // true
  }
}
