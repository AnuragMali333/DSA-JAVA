import java.util.Arrays;

public class mergeSortedArraysWithoutSpace {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 7 };
    int[] brr = { 0, 2, 6, 8, 9 };

    int i=arr.length-1;
    int j=0;

    while(i>=0 && j<brr.length){
      if(arr[i]>brr[j]){
        int temp=arr[i];
        arr[i]=brr[j];
        brr[j]=temp;
        i--; j++;
      }
      else{
        break;
      }
    }
    Arrays.sort(arr);
    Arrays.sort(brr);

    for (int ele : arr) {
      System.out.print( ele+" ");
    }
    for (int ele : brr) {
      System.out.print( ele+" ");
    }
  }
  
}