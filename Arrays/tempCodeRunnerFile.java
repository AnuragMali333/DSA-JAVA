public class nextGreatestEle {
  public static void main(String[] args) {
    int[]arr={12,8,41,37,2,49,16,28,21};

    int i=0;
    while (i<arr.length) {
      int greatest=Integer.MIN_VALUE;
      for(int j=i+1;j<arr.length;j++){
        if(arr[j]>greatest){
          greatest=arr[j];
        }
      }
      arr[i]=greatest;
      i++;
      if(i==arr.length-1){
        arr[i]=-1;
        break;
      }
    }
    
    for (int ele : arr) {
      System.out.print(ele+" ");
    }
  }
}
