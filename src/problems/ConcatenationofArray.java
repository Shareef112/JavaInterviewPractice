package problems;

import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,1})));
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,3,2,1})));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[2*nums.length];
        int rounds =1;
        int index = 0;
        for(int i=0;i<nums.length && rounds < 3;i++){
            result[index++] = nums[i];
            if(i==nums.length -1){
                rounds++;
                i=-1;
            }

        }
        return result;

    }
}
