import java.util.Scanner;

public class sort0and1s {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int []arr={1,0,0,1,0};
    int i=0;
    int j=arr.length-1;

    for (i = 0; i <j; ) {
      while (arr[i]==0) { // iterate all initial 0's
        i++;
      }
      while (arr[j]==1) { //iterate all 1's from behind
        j--;
      }
      if(i>j){  // if i exceeds j then array is already sorted  (as we increment i and j after the condition check it is essential to check again before swapping as we might end up swapping a pair of ele in a sorted array before the loop condition is checked again)
        break;
      }
      arr[i]=0;
      arr[j]=1;
     i++;
     j--;
      
    }
    for (int ele : arr) {
      System.out.print(ele+" ");
    }
    
  }
}
