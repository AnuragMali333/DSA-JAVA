public class scoreAfterFlippingMatrix2 {
  public static void main(String[] args) {
    int [][]grid={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
    int score=0;

    for (int i = 0; i < grid.length; i++) { // toggles rows
      int j=0;
      if(grid[i][j]==0){
        toggleRow(i, grid);
      }
    }

    for(int j=0;j<grid[0].length;j++){ // toggles columns
      int noOfzeros=0,noOfOnes=0;
      for (int i = 0; i < grid.length; i++) {
        if(grid[i][j]==0){
          noOfzeros++;
        }
        else{
          noOfOnes++;
        }
      }
      if(noOfzeros>noOfOnes){
        toggleColumn(j, grid);
        score+=(Math.pow(2, grid[0].length-1-j)*noOfzeros);
      }
      else{
        score+=(Math.pow(2, grid[0].length-1-j)*noOfOnes);
      }

    }
    System.out.println(score);
  }

  public static void toggleRow(int row,int[][]arr){
   for(int j=0;j<arr[0].length;j++){
    arr[row][j] = (arr[row][j] == 0) ? 1 : 0;
   }
  }

  public static void toggleColumn(int col,int[][]arr){
  for (int i = 0; i < arr.length; i++) {
    arr[i][col]=(arr[i][col]==0) ? 1 : 0;
  }
  }

  
}
