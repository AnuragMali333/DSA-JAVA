
import java.util.Arrays;

public class ReplacewithIndexInSortedArray {
  public static void main(String[] args) {
    int []arr={54,11,28,47,91,63};
    int []brr=Arrays.copyOf(arr, arr.length);
    Arrays.sort(brr);

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < brr.length; j++) {
        if(arr[i]==brr[j]){
          arr[i]=j;
          break;
        }
      }
    }

    for (int i : arr) {
      System.out.print(i+" ");
    }
  }
}
