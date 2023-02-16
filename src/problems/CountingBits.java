package problems;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));

    }
    public static int[] countBits(int n) {
        int[] output = new int[n+1];
        int index =0;
        for(int i=0;i<=n;i++){
            String bits = Integer.toBinaryString(i).replace("0","");
            output[index++] = bits.length();
        }
       return output;
    }
}
