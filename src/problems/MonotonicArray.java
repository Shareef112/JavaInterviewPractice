package problems;

import java.util.HashSet;
import java.util.Set;

public class MonotonicArray {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1,2,2,3}));
        System.out.println(isMonotonic(new int[]{1,1,2}));
        System.out.println(isMonotonic(new int[]{6,5,4,4}));
        System.out.println(isMonotonic(new int[]{1,3,2}));

    }
    public static boolean isMonotonic(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        Set<Integer> increase = new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                increase.add(0);
            } else if (nums[i - 1] > nums[i]) {
                increase.add(1);
            }
        }
        return increase.size() == 1;
    }
}
