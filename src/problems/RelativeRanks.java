package problems;

import java.util.*;

public class RelativeRanks {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(findRelativeRanks(new int[]{5,4,3,2,1})));
        System.out.println(Arrays.asList(findRelativeRanks(new int[]{10,3,8,9,4})));
    }

    public static String[] findRelativeRanks(int[] score) {
       List<Integer> positions = new ArrayList<>();

        for(int i=0;i<score.length;i++){
            positions.add(score[i]);
        }
        Collections.sort(positions,Collections.reverseOrder());
        String[] result = new String[score.length];
        int index =0;
        for(int s :score){
            if(positions.indexOf(s)==0){
                result[index++] = "Gold Medal";
            } else if (positions.indexOf(s)==1) {
                result[index++] = "Silver Medal";
            } else if (positions.indexOf(s)==2) {
                result[index++] = "Bronze Medal";
            }
            else{
                result[index++] = String.valueOf(positions.get(s)+1);
            }


        }

        return result;

    }
}
