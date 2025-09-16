public class deleteAndInsert {
  public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("abcdef");
    System.out.println(sb);

    sb.deleteCharAt(3);
    System.out.println(sb);

    sb.deleteCharAt(3);
    System.out.println(sb);

    sb.append("xyz");
    System.out.println(sb);
    sb.delete(0, 2);
    System.out.println(sb);

    sb.insert(0, 'A');
    System.out.println(sb);

  }
}
