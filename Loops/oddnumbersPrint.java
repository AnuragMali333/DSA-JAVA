public class oddnumbersPrint {
  public static void main(String[] args) {
    //100 iterations
    for(int i=0;i<=100;i++){
      if(i%2==0){
        continue;
      };
      System.out.print(i+" ");
    }
  }
}
