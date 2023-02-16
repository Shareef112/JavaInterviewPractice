package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3},516));
        System.out.println(addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9},1));
        System.out.println(addToArrayForm(new int[]{1,2,0,0},34));
        System.out.println(addToArrayForm(new int[]{2,7,4},181));
        System.out.println(addToArrayForm(new int[]{2,1,5},806));

    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        long n =0;
        for(int value : num){
            n = (n*10)+value;
        }
        n = n+k;
        while(n>0){
            long rem = n%10;
            result.add((int)rem);
            n = n/10;
        }
        Collections.reverse(result);

        return result;

    }
}
