package problems;

import java.util.ArrayList;
import java.util.List;

public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidbaooo"));
        System.out.println(checkInclusion("ab","eidboaoo"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        List<String> permitationStrings = new ArrayList<>();
        printPermutations(s1,"",permitationStrings);
        for(String str: permitationStrings){
            if(s2.contains(str)){
                return true;
            }
        }
        return false;

    }
    public static void printPermutations(String str, String ans, List<String> permutations){
        if(str.length() ==0){
            permutations.add(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String leftPart = str.substring(0,i);
            String rightPart = str.substring(i+1);
            String ros = leftPart+rightPart;
            printPermutations(ros,ans+ch,permutations);
        }


    }
}
