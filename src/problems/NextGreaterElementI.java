package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2})));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> baseMap = generateSubMap(nums2);
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = baseMap.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }

    private static Map<Integer, Integer> generateSubMap(int[] base) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> baseMap = new HashMap<>();
        for (int num : base) {
            while (!stack.isEmpty() && stack.peek() < num) {
                int pop = stack.pop();
                baseMap.put(pop, num);
            }
            stack.push(num);
        }
        return baseMap;
            }
        }


