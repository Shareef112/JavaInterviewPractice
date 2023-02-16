package problems;

import java.util.Stack;

public class StringReverseUsingStack {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "REVERSE";
        char[] chars = s.toCharArray();
        for(char c : chars){
            stack.push(c);
        }
        for(int i=0;i<s.length();i++){
            chars[i] = stack.pop();
        }
        System.out.println(new String(chars));
    }
}
