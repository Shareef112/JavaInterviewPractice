package problems;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer>  counts = new HashMap<>();
        for(int num : nums){
            counts.put(num,counts.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : counts.entrySet()){
            if(entry.getValue() >1){
                return true;
            }
        }
        return false;
    }
}
