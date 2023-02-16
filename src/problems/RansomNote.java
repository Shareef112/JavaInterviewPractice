package problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> rMap = new LinkedHashMap<>();
        Map<Character,Integer> mMap = new LinkedHashMap<>();

        if(ransomNote.equals(magazine)){
            return true;
        }

        for(int i=0;i<ransomNote.length();i++){
            rMap.put(ransomNote.charAt(i),rMap.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            mMap.put(magazine.charAt(i),mMap.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> chars : rMap.entrySet()){
            if(mMap.containsKey(chars.getKey())){
                if(mMap.get(chars.getKey())<chars.getValue()){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;

    }

}
