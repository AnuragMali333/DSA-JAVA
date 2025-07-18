import java.util.Scanner;

public class traversalIn2DArray {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[][] arr=new int [2][3];
    //arr[0][0]=9;

    int m=arr.length;// no of rows
    int n=arr[0].length; // no of columns
    System.out.println(m);
    System.out.println(n);

    // Input of 2D array
    for(int i=0;i<2;i++){ // for rows
      for(int j=0;j<3;j++){ // for columns
        System.out.print("Enter ele:");
        arr[i][j]=sc.nextInt();
      }
    }

     // Output of 2D array
    for(int i=0;i<2;i++){ // for rows
      for(int j=0;j<3;j++){ // for columns
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}
