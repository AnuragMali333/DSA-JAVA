import java.util.List;
import java.util.ArrayList;
public class setMatricesZero{
  public static void main(String[] args) {
    int [][]arr = {{1,1,1},{1,0,1},{1,1,1}};
    
    List<List<Integer>>v=new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      List<Integer>x=new ArrayList<>();
      for (int j = 0; j < arr[0].length; j++) {
        if(arr[i][j]==0){
          x.add(j);
        }
      }
      v.add(x);
    }

    for (int i = 0; i < v.size(); i++) {
      if(v.get(i).size()>0){
        setRowToZero(i, arr);
      }
      for (int j = 0; j < v.get(i).size(); j++) {
        setColToZero(v.get(i).get(j), arr);
      }
    }


    for ( int[] ele : arr) {
      for ( int x:ele) {
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