import java.util.Scanner;

public class Que1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the size of arr:");
    int n=sc.nextInt();
    int []arr=new int[n];

    for(int i=0;i<n;i++){
      System.out.print("Enter the "+(i)+" ele:");
      arr[i]=sc.nextInt();
    }

    for(int i=0;i<n;i++){
      if(arr[i]<35){
        System.out.print(i+" ");
      }
    }
  }
}
