import java.util.Scanner;

public class checkIfArrayIsSorted{
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter size of Array:");
    int size=sc.nextInt();
    int[]arr=new int[size];

    for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter ele no "+(i+1)+": ");
      arr[i]=sc.nextInt();

      
    }
    if(checkIfSorted(arr)){
      System.out.println("Array is sorted.");
    }
    else{
      System.out.println("Array is not sorted");
    }
  }

  public static boolean checkIfSorted(int[]arr){
    for(int i=0;i<arr.length-1;i++){
      if(arr[i]>arr[i+1]){
        return false;
      }
    }
    return true;
  }
}