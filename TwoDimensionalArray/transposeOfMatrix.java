//  Program to print the transpose of a matrix
public class transposeOfMatrix {
  public static void main(String[] args) {
    int [][]arr={{1,2,3},{4,5,6},{7,8,9}};

    int [][] brr=new int [arr[0].length][arr.length];

    for (int j = 0; j < arr[0].length; j++) {
      for (int i = 0; i < arr.length; i++) {
        brr[j][i]=arr[i][j];
        System.out.print(brr[j][i]+" ");
      }
      System.out.println();
    }
   }
}
