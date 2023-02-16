package problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class ThirdDistinctMaximum {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));
        int[] nums1 = {1,2};
        System.out.println(thirdMax(nums1));
        int[] nums2 = {2,2,3,1};
        System.out.println(thirdMax(nums2));
    }

    public static int thirdMax(int[] nums) {
        Map<Integer,Integer> values = new LinkedHashMap<>();
        int result=0;
        if(nums.length == 1){
            return nums[0];
        } else {
            for (int num : nums){
                values.put(num,values.getOrDefault(num,0)+1);
            }
            int count =0;
            for(Map.Entry<Integer,Integer> value : values.entrySet()){
                if(count <=3){
                    result = value.getKey();
                    count++;
                }
                else {
                    break;
                }
            }
        }
        return result;
    }
}
