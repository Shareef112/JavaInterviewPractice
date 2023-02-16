package problems;

import java.util.Stack;

public class ValidParanthisis {
    public static void main(String[] args) {
        System.out.println(isValid("({[]})"));
        System.out.println(isValid("{]"));
        System.out.println(isValid(")("));


    }

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for(char c: chars){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    if((c==')' && stack.peek() == '(') ||
                            (c==']' && stack.peek() == '[') ||
                            (c=='}' && stack.peek() == '{')){
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
