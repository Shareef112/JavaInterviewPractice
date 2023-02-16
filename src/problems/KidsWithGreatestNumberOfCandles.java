package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KidsWithGreatestNumberOfCandles {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3},3));
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2},1));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        List<Integer> listCandies = new ArrayList<>();
        for(int candy : candies){
            listCandies.add(candy);
        }
        Collections.sort(listCandies,Collections.reverseOrder());
        int high = listCandies.get(0);
        for(int candy : candies){
            if(candy+extraCandies >= high){
                result.add(true);
            }
            else {
                result.add(false);
            }
        }

        return result;
    }

}
