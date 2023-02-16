package problems;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
        int[] nums1 = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums1));
    }

    public  static int findMaxConsecutiveOnes(int[] nums) {
        int result =0;
        int temp =0;
        for(int num : nums){
            if(num==0){
                result = Math.max(temp, result);
                temp =0;
            }
            else{
                temp++;
            }

        }
        return Math.max(temp, result);

    }
}
