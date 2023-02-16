package DSNAlgo.algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,1,9,2,10};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        for(int i=1;i< arr.length;i++){  //unsorted part
            int temp = arr[i];
            int j = i-1;  // sorted part
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1] = temp;
        }
    }
}
