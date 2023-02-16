package problems;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] input = {4,7,3,4,8,1};
        int[] output = new int[input.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=input.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty()&&stack.peek() <=input[i]){
                    stack.pop();
                }
            }if(stack.isEmpty()){
                output[i] = -1;
            }
            else{
                output[i] = stack.peek();
            }
            stack.push(input[i]);
        }
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }
    }
}
