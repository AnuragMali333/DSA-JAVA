public class stringBuilderInJava {
  public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("Anurag");
    StringBuilder x=new StringBuilder(10);
    System.out.println(x.capacity());

    StringBuilder a=new StringBuilder();
    System.out.println(a.capacity());
    System.out.println(sb.capacity());
  }
}
