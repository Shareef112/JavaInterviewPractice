package problems;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] num = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(num));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int num : nums){
           if(count != num){
               return count;
           }
           count++;
        }
            return count;


    }
}
