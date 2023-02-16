package problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("ab","baab"));
    }

    public static boolean isSubsequence(String s, String t) {
        Map<Character,Integer> smapping = new LinkedHashMap<>();
        Map<Character,Integer> tmapping = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            smapping.put(s.charAt(i),i+1);
        }
        int index =1;
        for(int j=0;j<t.length();j++){
            if(smapping.containsKey(t.charAt(j))){
                tmapping.put(t.charAt(j),index++);
            }

        }
        if(smapping.size() != tmapping.size()){
            return false;
        }
        else{
            for(Map.Entry<Character,Integer> keys:smapping.entrySet()){
                if(keys.getValue() != tmapping.get(keys.getKey())){
                    return false;
                }
            }
        }
        return true;


    }
}
