import java.util.Scanner;

public class matrix {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter no of rows: ");
    int rows=sc.nextInt();
    System.out.println("Enter no of columns: ");
    int columns=sc.nextInt();

    int x=0, y=0 ,a=1;

    for (int i=1;i<=(rows+columns-1);i++){
      
      while (x>=0 && y<=columns - 1) {
        System.out.print(x+","+y+"  ");
        x--;y++;
      }
      x++;y--; //x=0 y=0

      if(y>=rows-1){
        x=rows-1;
        y=a;
        a++;
      }

      else{
        int temp=y;
        y=x;
        x=temp+1;
      }

      System.out.println();
    }
  }
}
