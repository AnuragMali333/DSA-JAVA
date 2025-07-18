import java.util.Scanner;

public class sumOfAllEle {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[][]arr=new int[3][3];
    int sum=0;


    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j]=sc.nextInt();
        sum+=arr[i][j];
      }
    }

    System.out.println("The sum of all ele is: "+sum);
  }
}
