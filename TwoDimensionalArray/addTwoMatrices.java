public class addTwoMatrices {
  public static void main(String[] args) {
    int[][]arr={{1,2,3},{4,5,6}};
    int[][]brr={{7,8,9},{10,11,12}};
    

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j]=arr[i][j]+brr[i][j];
      }
    }

    for (int[] ele : arr) {
      for (int x : ele) {
        System.out.print(x +" ");
      }
      System.out.println();
    }
  }
}
