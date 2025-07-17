import java.util.Scanner;

public class ReverseArray {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[]arr={10,20,30,40,50,60,70};
    for (int ele : arr) {
      System.out.print(ele+" ");
    }
    System.out.println();

    int temp;
    int i=0;
    int j=6;

    while(i<j){
      swap(arr,i,j);
      i++;
      j--;
    }

    for (int ele : arr) {
      System.out.print(ele+" ");
    }
  }
  public static void swap(int [] arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
}
