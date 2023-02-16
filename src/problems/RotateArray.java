package problems;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArrLeft(new int[]{1,2,3,4,5},2,5)));
    }
    public static int[] rotateArrLeft(int arr[], int d, int n)
    {

        for(int j=1;j<=d;j++){
            int first = arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1] = first;
        }
        return arr;
    }
}
