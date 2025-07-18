import java.util.Scanner;

public class largestElein2DArray {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[][]arr=new int[3][3];
    int max=Integer.MIN_VALUE;


    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j]=sc.nextInt();
        max=Math.max(max, arr[i][j]);
      }
    }

    System.out.println("The largest ele is: "+max);
  }
}
