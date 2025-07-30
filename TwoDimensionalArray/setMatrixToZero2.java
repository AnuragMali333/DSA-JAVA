public class setMatrixToZero2 {
  public static void main(String[] args) {
    int [][]arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
    int[]rows=new int[arr.length];
    int[]col=new int [arr[0].length];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if(arr[i][j]==0){
          rows[i]=1;
          col[j]=1;
        }
      }
    }

    int max=Math.max(rows.length, col.length);

    for (int k = 0; k < max; k++) {
      if(k<rows.length && rows[k]==1){
        setRowToZero(k, arr);
      }
      if(k<col.length && col[k]==1){
        setColToZero(k, arr);
      }
    }


    for (int[] ele : arr) {
      for (int x : ele) {
        System.out.print(x+" ");
      }
      System.out.println();
    }
    
  }

   public static void setRowToZero(int row,int[][]matrix){
    for (int j = 0; j < matrix[0].length; j++) {
      matrix[row][j]=0;
    }
  }

  public static void setColToZero(int col,int[][]matrix){
    for (int i = 0; i < matrix.length; i++) {
      matrix[i][col]=0;
    }
}}