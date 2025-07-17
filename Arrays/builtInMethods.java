import java.util.Arrays;

public class builtInMethods {

  public static void main(String[] args) {
    int[] arr={30,10,40,23,89,34};

    Arrays.sort(arr);
    System.out.println();

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }

    for(int ele:arr){ // For each loop of arrays
      System.out.print(ele+" ");
    }
  }
}