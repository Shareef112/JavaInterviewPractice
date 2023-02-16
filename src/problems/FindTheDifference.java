package problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("ae","aea"));
        System.out.println(findTheDifference("abcd","abcde"));
        System.out.println(findTheDifference("","y"));
    }

    public static char findTheDifference(String s, String t) {
        if(s.length() == 0 && t.length() >0){
            return t.charAt(0);
        }
        Map<Character, Integer> sMap = new LinkedHashMap<>();
        Map<Character, Integer> tMap = new LinkedHashMap<>();
        char c = ' ';
        for(int i=0;i<s.length();i++){
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> values : tMap.entrySet()){
            if(sMap.containsKey(values.getKey())){
                if(sMap.get(values.getKey()) < values.getValue()){
                    c = values.getKey();
                }
            }
            else{
                c = values.getKey();
            }
        }
        return c;

    }
}
