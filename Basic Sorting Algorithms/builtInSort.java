import java.util.Arrays;

public class builtInSort {
  public static void main(String[] args) {
    int []arr={-4,1,2,8,7,9};

    for (int ele : arr) {
      System.out.print(ele+" ");
    }
    System.out.println();

    Arrays.sort(arr);

    for (int ele : arr) {
      System.out.print(ele+" ");
    }
  }
}
