public class binarySearch {
  public static void main(String[] args) {
    int []arr={10,15,21,34,81,105,180,500};
    int target=34;
    int low=0,high=arr.length-1;
    boolean flag=false;
    int comparisons=0;

    while (low<=high) {
      int mid=(low+high)/2;

      if(arr[mid]<target){
        low=mid+1;
      }
      else if(arr[mid]>target){
        high=mid-1;
      }
      else if(arr[mid]==target){
        flag=true;
        comparisons++;
        System.out.println(target+" is present at index : "+mid+" found in "+comparisons+" iterations");
        break;
      }
      comparisons++;
    }

    if(flag==false){ // not present in array.
      System.out.println("Element is not present in array.");
    }
  }

}
