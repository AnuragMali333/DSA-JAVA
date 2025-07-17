import java.util.Scanner;

public class maxValueOfArray {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of array:");
    int size=sc.nextInt();

    int[]arr=new int[size];
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter the ele at "+i+" index:");
      arr[i]=sc.nextInt();
      if(arr[i]>max){
        max=arr[i];
      }
      //max=Math.max(max,arr[i]);
      if(arr[i]<min){
        min=arr[i];
      }
      
    }
  
    System.out.println();
    System.out.println("The max value of array is: "+max);
    System.out.println("The min value of array is "+min);
    
    

    
  }
}
