import java.util.Scanner;

public class secondLargestInArray{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the  size of array:");
    int size=sc.nextInt();

    int[]arr=new int[size];
    int max=Integer.MIN_VALUE;
    int secondLargestInArray=Integer.MIN_VALUE;


    for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter ele at index "+i+":");
      arr[i]=sc.nextInt();

      if(arr[i]>max){
        secondLargestInArray=max;
        max=arr[i];
      }
      else if((max>arr[i])&&(arr[i]>secondLargestInArray)){
        secondLargestInArray=arr[i];
      }
    }

    System.out.println();
    System.out.println("The max value is: "+max);
    
    if (secondLargestInArray == Integer.MIN_VALUE) {
      System.out.println("There is no second largest element (all elements might be the same).");
    } else {
      System.out.println("The second largest value is: " + secondLargestInArray);
    }

  }
}
