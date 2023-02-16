package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestPalindromeGenerate {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));

    }
    public static int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> data = new HashSet<Character>();
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (data.contains(c)) {
                count += 2;
                data.remove(c);
            }
            else {
                data.add(c);
            }
        }
        if (data.size() > 0) {
            count ++;
        }
        return count;

    }
}
