import java.util.Scanner;

public class linearSearch{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the size of array:");
    int n=sc.nextInt();

    int[]arr=new int[n];
    boolean found=false;

    for(int i=0;i<n;i++){
      System.out.print("Enter the "+i+" ele:");
      arr[i]=sc.nextInt();
    }

    System.out.println("Enter the value to be searched:");
    int val=sc.nextInt();

    for (int i = 0; i < arr.length; i++) {
      if(arr[i]==val){
        System.out.println("Value of "+val+" found at "+i+" th index.");
        found=true;
        break;
      }
    }

    if(found==false){
      System.out.println("value not found in arr.");
    }
  }
}