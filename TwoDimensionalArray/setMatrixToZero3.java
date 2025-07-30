public class setMatrixToZero3 {
  public static void main(String[] args) {
    int [][]arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
    boolean row=false,col=false;

    for(int k=0;k<Math.max(arr.length,arr[0].length);k++){
      if(k<arr.length && arr[k][0]==0){
        col=true;
      }
      if(k<arr[0].length && arr[0][k]==0){
        row=true;
      }
      if(row==true && col==true){
        break;
      }
    }

    for (int i = 1; i < arr.length; i++) { // travese submatrix and mark 
      for (int j = 1; j < arr[0].length; j++) {
        if(arr[i][j]==0){
          arr[i][0]=0;
          arr[0][j]=0;
        }
      }
    }

    for (int k = 1; k < Math.max(arr[0].length,arr.length); k++) {
      if(k<arr.length && arr[k][0]==0){
        setRowToZero(k, arr);
      }
      if(k<arr[0].length && arr[0][k]==0){
        setColToZero(k, arr);
      }
    }
    
    if(row){ // set 0th row 
      setRowToZero(0, arr);
    }
    if(col){ //set 0th col
      setColToZero(0, arr);
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
}
}
