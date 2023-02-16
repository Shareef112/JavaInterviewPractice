package problems;

import java.util.HashMap;
import java.util.Map;

public class MajarityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));

    }
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> counts = new HashMap<>();
        for(int num : nums){
            counts.put(num, counts.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> me : counts.entrySet()){
            if(me.getValue() > nums.length/2){
                return me.getKey();
            }
        }
        return -1;
    }
}
