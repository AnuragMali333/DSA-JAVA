import java.util.Arrays;

public class validAnagram {
  public static void main(String[] args) {
    String s="Anurag";
    String t="uAnagr";

    if(s.length()!=t.length()){
      System.out.println("Not Anagram.");
      return;
    }

    char[]arr=s.toCharArray();
    char[]brr=t.toCharArray();
    Arrays.sort(arr);
    Arrays.sort(brr);

    for (int i = 0; i < brr.length; i++) {
      if(arr[i]!=brr[i]){
        System.out.println("Not Anagram");
        return;
      }
    }
    System.out.println("Anagram");
    return;
    
  }
}
