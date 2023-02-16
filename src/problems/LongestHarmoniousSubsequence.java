package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        System.out.println(findLHS(new int[]{1,2,2,3,4,5,1,1,1,1}));
        System.out.println(findLHS(new int[]{1}));
        System.out.println(findLHS(new int[]{1,3,2,2,5,2,3,7}));
        System.out.println(findLHS(new int[]{1,2,3,4}));
        System.out.println(findLHS(new int[]{1,1,1,1}));
    }

    public static int findLHS(int[] nums) {
        int result =0;
        int first =0;
        int last = nums.length;
        List<Integer> numList = new ArrayList<>();
        for(int num : nums){
            numList.add(num);
        }
        if(nums.length <2){
            if(nums.length == 1 && nums[0] == 1){
                return 1;
            }
            else{
                return result;
            }

        }
        while (first<last){
            List<Integer> sl = numList.subList(first,last);
            Collections.sort(sl);
            if(sl.get(sl.size()-1) - sl.get(0) == 1){
                if(sl.size() > result){
                    result = sl.size();
                }

            }
            first++;
            List<Integer> sl1 = numList.subList(first,last);
            Collections.sort(sl1);
            if(sl1.get(sl1.size()-1) - sl1.get(0) == 1){
                if(sl.size() > result){
                    result = sl.size();
                }
            }
            first--;
            last--;
            List<Integer> sll = numList.subList(first,last);
            Collections.sort(sll);
            if(sll.get(sll.size()-1) - sll.get(0) == 1){
                if(sl.size() > result){
                    result = sl.size();
                }
            }
            first++;

        }

        return result;
    }
}
