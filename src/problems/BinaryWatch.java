package problems;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {

    public static void main(String[] args) {
        System.out.println(readBinaryWatch(1));
    }

    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();


        // Hours iterate from 0-11 and
        // Minutes iterate from 0-59.

        // See for which values, number of 1's match
        // with the value <num> provided.

        for(int h=0; h<12; h++) {

            for(int m=0; m<60; m++) {

                // Number of set bits in hour portion and in minute
                // part has to be equal to num.
                if(Integer.bitCount(h)
                        + Integer.bitCount(m) == turnedOn) {
                    ans.add(String.format("%d:%02d",h,m));
                }

            }

        }

        return ans;
    }
}
