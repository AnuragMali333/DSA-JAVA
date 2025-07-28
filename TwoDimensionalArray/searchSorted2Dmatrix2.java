public class searchSorted2Dmatrix2{
  public static void main(String[] args) {
    int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
    int target=18;

    int i=0,j=matrix[0].length-1;

    while(i<matrix.length && j>=0){
      if(matrix[i][j]==target){
        System.out.println("Ele found at "+i+" "+j);
        break;
      }
      else if(matrix[i][j]>target){
        j--;
      }
      else{
        i++;
      }
    }
  }
}