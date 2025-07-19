public class rotateBy90clockwise {
  public static void main(String[] args) {
    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int m = arr.length;
    int n = arr[0].length;

    int[][] transpose = new int[n][m];

    for (int i = 0; i < transpose.length; i++) { // transpose
      for (int j = 0; j < transpose[0].length; j++) {
        transpose[i][j] = arr[j][i];
      }
    }

    for (int i = 0; i < transpose.length; i++) { // reverse all rows of
      int k = n - 1;
      for (int j = 0; j < k; j++) {
        int temp = transpose[i][j];
        transpose[i][j] = transpose[i][k];
        transpose[i][k] = temp;
        k--;
      }
    }

    for (int[] ele : transpose) {
      for (int x : ele) {
        System.out.print(x+" ");
      }
      System.out.println();
    }
  }

}
