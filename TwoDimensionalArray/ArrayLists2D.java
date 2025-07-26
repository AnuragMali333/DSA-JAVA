import java.util.ArrayList;
import java.util.List;

public class ArrayLists2D {
  public static void main(String[] args) {
    List<Integer>a=new ArrayList<>();
    a.add(10);a.add(20);a.add(30);

    List<Integer>b=new ArrayList<>();
    b.add(40);b.add(50);

    List<Integer>c=new ArrayList<>();

    List<Integer>d=new ArrayList<>();
    d.add(60);

    List<List<Integer>>v= new ArrayList<>();
    v.add(a);v.add(b);v.add(c);v.add(d);
  // Print 1D ArrayList

  // System.out.println(a); OR
  //  for (int i = 0; i < a.size(); i++) {
  //   System.out.print(a.get(i)+" ");
  //  }
  
  // Print 2D ArrayList
  // for (int i = 0; i < v.size(); i++) {
  //   System.out.println(v.get(i));
  // }

  //System.out.println(v.get(2).get(2));

  for (int i = 0; i < v.size(); i++) {
   for (int j = 0; j < v.get(i).size(); j++) {
    System.out.print(v.get(i).get(j)+" ");
   }
   System.out.println();
  }

  }  
  
} 
