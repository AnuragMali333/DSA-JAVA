public class sumOfEle {
  public static void main(String[] args) {
    int[] arr={81,17,45,36,31,100,60};
    int n=arr.length;
    int sum=0;

    for(int i=0;i<n;i++){
      sum+=arr[i];
    }
    
    System.out.println("The sum of all ele is: "+(sum));
  }
}
