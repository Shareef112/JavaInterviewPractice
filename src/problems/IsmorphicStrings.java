package problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class IsmorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper","title"));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        else{
            Map<Character,Character> smapping = new LinkedHashMap<>();
            Map<Character,Character> tmapping = new LinkedHashMap<>();

            for(int i=0;i<s.length();i++){
                if(smapping.containsKey(s.charAt(i))){
                    if(smapping.get(s.charAt(i))!=t.charAt(i)){
                        return false;
                    }
                }
                else if(tmapping.containsKey(t.charAt(i))){
                    if(tmapping.get(t.charAt(i))!=s.charAt(i)){
                        return false;
                    }
                }
                else{
                    smapping.put(s.charAt(i),t.charAt(i));
                    tmapping.put(t.charAt(i),s.charAt(i));

                }
            }
            return true;
        }

    }
}
