public class scoreAfterFlippingMatrix {
  public static void main(String[] args) {
    int[][]grid={{0}};
    System.out.println(calculateScore(grid));

    for (int i = 0; i < grid.length; i++) {
      int scoreBeforeToggle=calculateScore(grid);
      toggleRow(i, grid);
      int scoreAfterToggle=calculateScore(grid);

      if(scoreBeforeToggle>scoreAfterToggle){
        toggleRow(i, grid);
      }
    }

    for( int j=0;j<grid[0].length;j++){
       int scoreBeforeToggle=calculateScore(grid);
       toggleColumn(j, grid);
       int scoreAfterToggle=calculateScore(grid);

       if(scoreBeforeToggle>scoreAfterToggle){
        toggleColumn(j, grid);
      }
    }

    System.out.println(calculateScore(grid));
  }

  public static int calculateScore (int[][]arr){
    int score=0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        score+=arr[i][j]*Math.pow(2, arr[0].length-1-j);
      }
    }
    return score;
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
