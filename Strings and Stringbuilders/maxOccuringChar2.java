import java.util.Scanner;

public class maxOccuringChar2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String  s=sc.next();
    int[]arr=new int[26]; //Frequency array
    int maxFreq=-1;

    for (int i = 0; i < s.length(); i++) { // filling frequency array
      char ch=s.charAt(i);
      int idx=(int)ch-97;
      arr[idx]++;
    }

    for (int i = 0; i < arr.length; i++) {// calculate maxFreq
      maxFreq=Math.max(arr[i],maxFreq);
    }

    for (int i = 0; i < arr.length; i++) {
      if(arr[i]==maxFreq){
        System.out.print((char)(i+97));
      }
    }




  }
}
