package problems;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,7,9,7,6,7}, nums2 = {5,0,0,6,1,6,2,2,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums = new HashSet<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        for(int num : nums1){
            nums.add(num);
        }
        for(int num : nums2){
            if(nums.contains(num)){
                if(!output.contains(num)){
                    output.add(num);
                }
            }
        }
        int[] outputArray = new int[output.size()];
        for(int num : output){
            outputArray[index++] = num;
        }
        return outputArray;

    }
}
