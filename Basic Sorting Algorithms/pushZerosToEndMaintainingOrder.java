public class pushZerosToEndMaintainingOrder {
  public static void main(String[] args) {
    int []arr={1,0,4,0,2,0,0,0,0,-40,0,100,0,5};

    int firstZeroIndex=-1;
    boolean betweenZeros=false;

    for (int i = 0; i < arr.length; i++) {
     if(arr[i]!=0){
      if(firstZeroIndex==-1){
        continue;
      }
      else{
        int temp=arr[i];
        arr[i]=arr[firstZeroIndex];
        arr[firstZeroIndex]=temp;
        if(betweenZeros){
          firstZeroIndex++;
        }
        else{
          firstZeroIndex=i;
        }
      }
     }
     else{
      if(firstZeroIndex==-1){
        firstZeroIndex=i;
      }
      else{
        betweenZeros=true;
      }

     }
    }

    for (int i : arr) {
      System.out.print(i+" ");
    }

  }
}
