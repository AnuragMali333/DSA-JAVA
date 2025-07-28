public class searchSorted2DMatrix {
  public static void main(String[] args) {
    int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
    int target=8;
    int lastCol=matrix[0].length-1,firstRow=0,lastRow=matrix.length-1;
    boolean found=false;


   for(int j=0;j<matrix[0].length;j++){ // Find last col
    if(matrix[0][j]<=target){
      lastCol=j;
    }
    else{
      break;
    }
   }

   for (int i = 0; i < matrix.length; i++) { // Find first row
    if(matrix[i][lastCol]>=target){
      firstRow=i;
      break;
    }
   }

   for(int i=firstRow;i<matrix.length;i++){ // Find last row
    if(matrix[i][0]>target){
      lastRow=i-1;
      break;
    }
   }

  for(int i=firstRow;i<=lastRow;i++){
    for (int j = 0; j <= lastCol; j++) {
      if(matrix[i][j]==target){
        found=true;
        System.out.println("Ele found at "+i+" "+j);
      }
    }
  }
  if(found==false){
    System.out.println("Ele not found");
  }
  }
}
