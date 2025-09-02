package DSNAlgo.algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5,1,10,2,9};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] arr){
       int n = arr.length;
    for(int i=1;i<n;i++){ //unsorted portion
      int temp = arr[i];
      int j = i-1; // sorted portion
      while (j>=0 && arr[j] > temp){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = temp;
    }
}
