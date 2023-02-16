package problems;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 ={2,5,7};
        int[] arr2 ={3,4,9};
        System.out.println(Arrays.toString(mergeTwoSortedArrays(arr1,arr2)));

    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2){
        int i=0;
        int j=0;
        int k=0;
        int[] result = new int[arr1.length+arr2.length];
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                result[k] = arr1[i];
                i++;
            }
            else{
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length){
            result[k] = arr2[j];
            j++;
            k++;
        }
      return result;
    }
}
