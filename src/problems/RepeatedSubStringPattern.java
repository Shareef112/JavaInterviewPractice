package problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedSubStringPattern {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
        System.out.println(repeatedSubstringPattern("aba"));
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));
        System.out.println(repeatedSubstringPattern("a"));
        System.out.println(repeatedSubstringPattern("ababba"));



    }

    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] kmp = new int[n];
        char[] arr = s.toCharArray();
        for(int i = 1; i < n; i++){
            int index = kmp[i - 1];
            while(index > 0 && arr[i] != arr[index]){
                index = kmp[index - 1];
            }
            if(arr[i] == arr[index]){
                index++;
            }
            kmp[i] = index;
        }
        int t= kmp[n - 1];
        return t > 0 && n % (n - t) == 0;
    }

}
