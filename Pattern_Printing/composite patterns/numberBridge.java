import java.util.Scanner;

public class numberBridge {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter the no of rows:");
    int rows=sc.nextInt();
    System.out.print("Enter the no of columns:");
    int columns=sc.nextInt();

    int midl=(columns/2)+1;
    int midr=(columns/2)+1;


    for(int i=1;i<=rows;i++){
      for(int j=1;j<=columns;j++){
        if(j<=midl || j>=midr){
          System.out.print(j+" ");
        }
        else{
          System.out.print("  ");
        }
      }
      midl--;
      midr++;
      System.out.println();
    }
  }
}
