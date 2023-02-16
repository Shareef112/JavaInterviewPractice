package problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class EncryptString {
    public static void main(String[] args) {
        System.out.println(encryptString("abbc"));
    }

    static String encryptString(String S){
        Map<Character,Long> chars = new LinkedHashMap<>();
        long count =1;
        for(int i=0;i<S.length();i++){
            if(chars.containsKey(S.charAt(i))){
                chars.put(S.charAt(i),chars.get(S.charAt(i))+1);
            }
            else{
                chars.put(S.charAt(i),count);
            }
        }
        String output ="";
        for(int j=chars.size()-1;j>=0;j--){
            output = output+Long.toHexString(chars.get(chars.get(j)))+S.charAt(j);
        }
        return output;
    }

}
