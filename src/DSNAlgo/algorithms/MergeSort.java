package DSNAlgo.algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr ={5,9,2,4,3};
        int[] temp = new int[arr.length];
        sort(arr,temp,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int[] temp, int low, int high){
        if(low < high){
            int mid = low+(high-low)/2;
            sort(arr,temp,low,mid);
            sort(arr,temp,mid+1,high);
            merge(arr,temp,low,mid,high);
        }
    }

    private static void merge(int[] arr, int[] temp,int low, int mid, int high){
        for(int i=low;i<=high;i++){
            temp[i] = arr[i];
        }
        int i=low, j= mid+1;
        int k = low;
        while(i<=mid && j<= high){
            if(temp[i] <= temp[j]){
                arr[k] = temp[i];
                i++;
            }
            else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k] = temp[i];
            i++;
            k++;
        }
    }
}
