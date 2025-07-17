import java.util.Arrays;

public class copyOfArray {
  public static void main(String[] args) {
    int[] arr={30,10,40,23,89,34};
    
    for (int i : arr) {
      System.out.print(i+" ");
    }
    System.out.println();

    // int[]nums=arr; // shallow copy
    // // for (int i : nums) {
    // //   System.out.print(i+" ");
    // // }
    // nums[0]=70;
    // System.out.println(arr[0]);

    //Method 1(Deep Copyof an array)
    int[]brr=Arrays.copyOf(arr,arr.length); 

    System.out.println(arr[0]);

    //Method 2
    int[]crr=new int[arr.length];
    for (int i : crr) {
      crr[i]=arr[i];
    }
    
    for (int i : arr) {
      System.out.print(i+" ");
    }
    System.out.println();
  }
}
