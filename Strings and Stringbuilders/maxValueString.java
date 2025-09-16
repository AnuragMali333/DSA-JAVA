import java.util.ArrayList;

public class maxValueString {
  public static void main(String[] args) {
    String []arr={"89572879868575564878678","767856574647498504375","8573987587398568765","98545643789612345432128","00000000000000000003858783643784746"};

    ArrayList<Integer>maxLengthStrings=new ArrayList<>(arr.length);
    int maxLength=0;

    for (int i = 0; i < arr.length; i++) {
      int j=0;
      while(arr[i].charAt(j)=='0'){
        j++;
      }
      arr[i]=arr[i].substring(j, arr[i].length());

      if(arr[i].length()>maxLength){
        maxLength=arr[i].length();
        maxLengthStrings.clear();
        maxLengthStrings.add(i);
      }
      else if(arr[i].length()==maxLength){
        maxLengthStrings.add(i);
      }
    }

    int maxStringIndex=0;

    for (int i = 0; i < maxLengthStrings.size(); i++) {
      if(arr[maxLengthStrings.get(i)].compareTo(arr[maxLengthStrings.get(maxStringIndex)])>0){
        maxStringIndex=i;
      }
    }

    System.out.println(arr[maxLengthStrings.get(maxStringIndex)]);

    
}

}
