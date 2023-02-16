package problems;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

    public static int[] moveZeroes(int[] nums) {
       int index = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] !=0){
                nums[index++] = nums[j];
            }

        }
        for(int z = index;z<nums.length;z++){
            nums[z] =0;
        }

        return nums;
    }
}
