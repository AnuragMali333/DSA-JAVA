import java.util.Scanner;

public class sort0and1and2 { // Two pass solution
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int[]arr={0,1,2,0,1,2,1,2,0,0,1,0,2};
    int n=arr.length;
    int noOfOnes=0; int noOfZeroes=0;

      for (int ele : arr) {
        if(ele==0){
          noOfZeroes++;
        }
        else if(ele==1){
          noOfOnes++;
        }
      }

      int noOfTwos=n-noOfZeroes-noOfOnes;

      for (int i = 0; i < arr.length; i++) {
        if(noOfZeroes>0){
          arr[i]=0;
          noOfZeroes--;
        }
        else if(noOfOnes>0){
          arr[i]=1;
          noOfOnes--;
        }
        else{
          arr[i]=2;

        }
      }

      for (int i : arr) {
        System.out.print(i+" ");
      }
  }
}
