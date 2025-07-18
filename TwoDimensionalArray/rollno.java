// Program to store roll number and marks obtained by students side by side in 2D array.

import java.util.Scanner;

public class rollno {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[][] arr=new int[4][2];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j]=sc.nextInt();
      }
    }


    for (int[] ele : arr) {
      for (int x : ele) {
        System.out.print(x+" ");
      }
      System.out.println();
    }
  }
}
