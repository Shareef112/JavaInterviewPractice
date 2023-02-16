package problems;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sqauredofSortedArray(arr)));
    }

    public static int[] sqauredofSortedArray(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        int i=0,j=n-1;
        for(int k = n-1;k>=0;k--){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                result[k] = arr[i] * arr[i];
                i++;
            }
            else{
                result[k] = arr[j] *arr[j];
                j--;
            }
        }
        return result;


    }



}
