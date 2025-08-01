public class interning {
  public static void main(String[] args) {
    String s="Anurag";// Anurag->Tnurag
    String q="Anurag"; // q points to the same string in memory
    //s.charAt(0)='T'; Error

    s="Madhav";
    System.out.println(s);

    String t=new String("Anurag");// new string gets created with different memory



  }
}
