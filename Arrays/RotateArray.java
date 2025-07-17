import java.util.Scanner;

public class RotateArray{
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int[]arr={10,20,30,40,50};

    System.out.print("Enter the value of k:");
    int k=sc.nextInt();
    RotateArray(arr, k);
    
  }

  public static void RotateArray(int[]arr, int k){
    int n=arr.length;
    k=k%n;

    reverseArray(arr, 0, n-1); // Reverse entire array
    reverseArray(arr, 0, k-1); // Reverse first k elements
    reverseArray(arr, k, n-1); // Reverse remaining array 
    

    for (int ele : arr) { // print rotated array
      System.out.print(ele+" ");
    }
  }

  public static void reverseArray(int[]arr, int i,int j){
    int temp;

    for(int a=i;a<j;){
      temp=arr[a];
      arr[a]=arr[j];
      arr[j]=temp;
      a++;
      j--;
    }
    
  }
}
