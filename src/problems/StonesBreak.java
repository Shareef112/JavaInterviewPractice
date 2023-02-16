package problems;

import java.util.Arrays;

public class StonesBreak {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{7,6,7,6,9}));
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
        System.out.println(lastStoneWeight(new int[]{1}));
        System.out.println(lastStoneWeight(new int[]{1,1,1,1}));
    }
    public static int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return 1;
        }
        Arrays.sort(stones);
        for(int i=stones.length-1;i>0;i--){
            if(stones[i] != stones[i-1]){
                stones[i-1]=Math.abs(stones[i]-stones[i-1]);
                stones[i]=0;

            }
            else{
                stones[i] =0;
                stones[i-1] =0;
            }
        }
        return stones[0];

    }
}
