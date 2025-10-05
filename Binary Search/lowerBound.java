import java.util.Scanner;

public class lowerBound {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int []arr={10,20,30,30,40,50,60,70};
    System.out.print("Enter target:");
    int target=sc.nextInt();

    int lo=0;
    int hi=arr.length-1;
    int lowerBound=0;

    if (arr[lo]>target) { // If it's smaller than the lowest value in array
      System.out.println(lowerBound);
    }
    else if(arr[hi]<target){// If it's greater than the highest value in array
      lowerBound=arr.length;
      System.out.println(lowerBound);
    }

    else{ // If it's between the lowest and the highest value in array.
      while (lo<=hi) {
        int mid=lo+(hi-lo)/2;

        if (arr[mid]==target) {
          lowerBound=mid;
          while (arr[lowerBound]==arr[lowerBound-1]) { // if There are multiple occurences of a value;
            lowerBound--;
          }
          break;
        }

        else if(arr[mid]<target){
          lo=mid+1;
        }

        else{
          lowerBound=mid;
          hi=mid-1;
        }
      }
      System.out.println(lowerBound);
    }
  }
}
