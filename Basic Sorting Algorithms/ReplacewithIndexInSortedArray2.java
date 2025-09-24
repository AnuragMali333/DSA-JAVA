public class ReplacewithIndexInSortedArray2 {
  public static void main(String[] args) {
    int []arr={0,-1,-2,-3,-4};
    int prevmin=Integer.MIN_VALUE;
    int mindex=0;
    int counter=0;
    

    for (int i = 0; i < arr.length; i++) {
      int currentmin=Integer.MAX_VALUE;
      for (int j = 0; j < arr.length; j++) {
        if(arr[j]>prevmin && arr[j]<currentmin){
          currentmin=arr[j];
          mindex=j;
        }
      }
      prevmin=currentmin;
      arr[mindex]=counter++;
    }

    for (int i : arr) {
      System.out.print(i+" ");
    }
  }
}
