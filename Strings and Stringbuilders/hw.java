public class hw {
  public static void main(String[] args) {
    StringBuilder sb= new StringBuilder("ABCD");
    int i=0,j=sb.length()-1;
    System.out.println(sb.reverse());
    for (; i < j; ) {
      char temp=sb.charAt(i);
      sb.setCharAt(i, sb.charAt(j));
      sb.setCharAt(j, temp);
      i++; j--;
    }
    System.out.println(sb);
    
  }
}
