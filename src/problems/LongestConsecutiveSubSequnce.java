package problems;

import java.util.Arrays;

public class LongestConsecutiveSubSequnce {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(findLongestConseqSubseq(nums));
    }

    public static int findLongestConseqSubseq(int arr[])
    {
        Arrays.sort(arr);
        int count =arr[0];
        int result =1;
        int temp =0;
        for(int num : arr){
            if(num == count){
                count++;
                temp++;
            }
            else{
                if(temp > result){
                    result = temp;
                }
                if(++count == num ){
                    temp=1;
                }
                else{
                    temp=0;
                }
            }
        }
        if(temp > result){
            return temp;
        }
        else {
            return result;
        }
    }
}
