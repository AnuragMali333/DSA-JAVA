public class stringCompression {
  public static void main(String[] args) {
    char[]chars={'a','a','a','b','b','c','c','c','d'};
    int index=0;

        for(int i=0;i<chars.length;i++){
            int freq=1;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                freq++;
                i++;
            }
            chars[index]=chars[i];
            index++;

            if(freq>1){
                String freqStr=String.valueOf(freq);
                for(int j=0;j<freqStr.length();j++){
                    chars[index]=freqStr.charAt(j);
                    index++;
                }
            }
        }

        int length=index;
        
        for(;index<chars.length;index++){
            chars[index]='\u0000';
        }
        System.out.println(length);
  }
}
