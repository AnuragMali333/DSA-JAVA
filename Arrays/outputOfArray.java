import java.util.Scanner;

public class outputOfArray {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter the size of array:");
    int n=sc.nextInt();
    int[]arr=new int[n];
    
    for(int i=0;i<n;i++){// input ->loop
      System.out.print("Enter the "+(i+1) +" th element:");
      arr[i]=sc.nextInt();
    }

    //output -> loop
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}