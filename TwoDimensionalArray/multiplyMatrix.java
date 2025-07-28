public class multiplyMatrix {
  public static void main(String args[]) {
    int[][] arr1 = { { 7, 8, 9, 50 }, { 19, 12, 99, 12 }, { 7, 60, 17, 19 } }; // m*n
    int[][] arr2 = { { 7, 2, 31, 28, 29, 39 }, { 5, 6, 7, 8, 17, 57 }, { 9, 10, 11, 12, 22, 999 },
        { 17, 12, 99, 69, 420, 1 } }; // p*q
    if (arr1[0].length != arr2.length) {
      System.out.println("Matrix multiplication not possible.");
      return;
    } else {
      int[][] ans = new int[arr1.length][arr2[0].length]; // m*q

      for (int i = 0; i < ans.length; i++) {
        for (int j = 0; j < ans[0].length; j++) {
          ans[i][j] = multiply(arr1, arr2, i, j);
        }
      }

      for (int[] ele : ans) {
        for (int x : ele) {
          System.out.print(x + " ");
        }
        System.out.println();
      }
    }

  }

  public static int multiply(int[][] arr1, int[][] arr2, int row, int col) {
    int res = 0;

    for (int j = 0; j < arr1[0].length; j++) {
      res += arr1[row][j] * arr2[j][col];
    }
    return res;
  }
}
