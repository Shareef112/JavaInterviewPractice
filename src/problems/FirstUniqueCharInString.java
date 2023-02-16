package problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));

    }

    public static int firstUniqChar(String s) {
          if(s.length()==0 || s == null){
              return -1;
          }
          char c =' ';
        Map<Character,Integer> chars = new LinkedHashMap<>();
          for(int i=0;i<s.length();i++){
              chars.put(s.charAt(i),chars.getOrDefault(s.charAt(i),0)+1);
          }
          for(Map.Entry<Character,Integer> counts : chars.entrySet()){
              if(counts.getValue() == 1){
                  c = counts.getKey();
                  break;
              }
          }
          if(c == ' '){
              return -1;
          }
          else{
              return s.indexOf(c);
          }

    }
}
