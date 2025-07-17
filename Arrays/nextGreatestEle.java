public class nextGreatestEle {
  public static void main(String[] args) {
    int[]arr={12,8,41,37,2,49,16,28,21};
    int i=arr.length-2;
    int max =arr[arr.length-1]; //21
    arr[arr.length-1]=-1; // set last ele as -1

    while(i>=0){
     int temp=arr[i];
     arr[i]=max;
     max=Math.max(max, temp);
     i--;
    
    }
    
    for (int j : arr) {
      System.out.print(j+" ");
    }
  }
}



/*Brute Force

 int i=0;
    while (i<arr.length-1) {
      int greatest=Integer.MIN_VALUE;
      for(int j=i+1;j<arr.length;j++){
        greatest=Math.max(greatest, arr[j]);
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
    }*/