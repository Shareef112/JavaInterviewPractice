package problems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[]{8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290}));
        System.out.println(mostFrequentEven(new int[]{0,1,2,2,4,4,1}));
        System.out.println(mostFrequentEven(new int[]{4,4,4,9,2,4}));
        System.out.println(mostFrequentEven(new int[]{29,47,21,41,13,37,25,7}));

    }
    public static int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> evenCount = new LinkedHashMap<>();
        Arrays.sort(nums);
        for(int num: nums){
            if(num%2==0){
                evenCount.put(num,evenCount.getOrDefault(num,0)+1);
            }
        }
        int count =0;
        if(evenCount.size() == 0){
            return -1;
        }

            int result =-1;


        for(Map.Entry<Integer,Integer> entry : evenCount.entrySet()){
            if(entry.getValue() >count){
                count = entry.getValue();
                result = entry.getKey();
            }

        }
        return result;

    }
}
