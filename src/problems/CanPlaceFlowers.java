package problems;

import java.util.Arrays;

public class CanPlaceFlowers {
    public static void main(String[] args) {
      //  System.out.println(Arrays.asList(canPlaceFlowers(new int[]{0},0)));
       // System.out.println(Arrays.asList(canPlaceFlowers(new int[]{1},0)));
        System.out.println(Arrays.asList(canPlaceFlowers(new int[]{1,0,0,0,0,1},2)));
        System.out.println(Arrays.asList(canPlaceFlowers(new int[]{1,0,0,0,1,0,0},2)));
        System.out.println(Arrays.asList(canPlaceFlowers(new int[]{1,0,0,0,1},1)));
        System.out.println(Arrays.asList(canPlaceFlowers(new int[]{1,0,0,0,1},2)));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 0 || n <= 0) return true;
        int m = flowerbed.length;
        for (int i = 0; i < m; i++) {
            if (flowerbed[i] == 1) continue;
            int lastVal = i == 0 ? 0 : flowerbed[i-1];
            int nextval = i == m-1? 0: flowerbed[i+1];
            if (lastVal == 0 && nextval == 0) {
                flowerbed[i] = 1;
                n--;
            }
            if (n <= 0) return true;
        }

        return false;

    }
}
