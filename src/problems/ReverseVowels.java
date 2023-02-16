package problems;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        char[] chars =s.toCharArray();
        for(char c: chars){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                    c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                vowels.add(c);
            }
        }
        String output = "";
        int len = vowels.size()-1;
        for(char c: chars){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                    c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                output = output+vowels.get(len);
                len--;
            }
            else{
                output = output+c;
            }
        }
       return output;
    }

}
