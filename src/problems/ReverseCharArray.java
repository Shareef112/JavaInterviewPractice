package problems;

import java.util.Arrays;

public class ReverseCharArray {
    public static void main(String[] args) {
        char[] s = {'h','a','n','n','a','h'};
        System.out.println(Arrays.toString(reverseString(s)));
    }

    public static char[] reverseString(char[] s) {
        int start =0;
        int end = s.length-1;
        while(start<=end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;

        }
        return s;

    }
}
