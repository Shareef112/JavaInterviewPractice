package problems;

import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800}, dep ={910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr,dep,6));
    }

    public static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int ar = 1;
        int dp = 0;
        int noOfPlatfrms=1;
        int res=0;
        while (ar<n && dp<n){
            if(arr[ar]<=dep[dp]){
                noOfPlatfrms++;
                ar++;
            }
            else if(arr[ar]>dep[dp]){
                noOfPlatfrms--;
                dp++;
            }
            res=Math.max(res,noOfPlatfrms);
        }
        return res;
    }
}
