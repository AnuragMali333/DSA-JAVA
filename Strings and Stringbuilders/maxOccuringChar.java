import java.util.Arrays;

public class maxOccuringChar { 
  public static void main(String[] args) {
    String s="abaaacrmnrrarr";
    StringBuilder sb=new StringBuilder("");

    char[]arr=s.toCharArray();
    Arrays.sort(arr);

    int maxFreq=0;

    for (int i = 0; i < arr.length; i++) {
      int freq=1;
      while(i<arr.length -1 &&arr[i]==arr[i+1]){
        freq++;i++;
      }
      if(freq==maxFreq){
        sb.append(arr[i]);
      }

      if(freq>maxFreq){
        sb.setLength(0);
        maxFreq=freq;
        sb.append(arr[i]);
      }
      }

      for (int i = 0; i < sb.length(); i++) {
        System.out.println(sb.charAt(i));
      }
    }
  }
