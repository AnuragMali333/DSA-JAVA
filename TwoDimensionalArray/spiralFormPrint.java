public class spiralFormPrint {
  public static void main(String[] args) {
    int[][]arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

    int minRow=0;
    int maxRow=arr.length-1;
    int minCol=0;
    int maxCol=arr[0].length-1;

    while(minRow<=maxRow && minCol<=maxCol){
      for(int j=minCol;j<=maxCol;j++){  // Iterate minRow:  j=minCol ---> maxCol
        System.out.print(arr[minRow][j]+"  ");
      }
      minRow++;
      if(minRow>maxRow || minCol>maxCol) break;

      for(int i=minRow;i<=maxRow;i++){ // Iterate maxCol:  i=minRow ---> maxRow
        System.out.print(arr[i][maxCol]+"  ");
      }
      maxCol--;
      if(minRow>maxRow || minCol>maxCol) break;

      for(int j=maxCol;j>=minCol;j--){ // Iterate maxRow: j=maxCol ---> minCol
        System.out.print(arr[maxRow][j]+"  ");
      }
      maxRow--;
      if(minRow>maxRow || minCol>maxCol) break;

      for(int i=maxRow;i>=minRow;i--){ // Iterate minCol: i=maxRow --->minRow
        System.out.print(arr[i][minCol]+"  ");
      }
      minCol++;
      if(minRow>maxRow || minCol>maxCol) break;
    }



  }
}