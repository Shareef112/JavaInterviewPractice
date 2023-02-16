package problems;

import java.util.ArrayList;

public class SubArraywithGivenSum {

    public static void main(String[] args) {
    int[] arr ={1,2,3,4,5,6,7,8,9,10};
    int n = 10;
    int s = 15;
        System.out.println(subarraySum(arr,n,s));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        int currentSum = arr[0], start = 0, i;

        ArrayList<Integer> ar = new ArrayList<>();



        for (i = 1; i <= n; i++) {

            while (currentSum > s && start < i - 1) {

                currentSum = currentSum - arr[start];

                start++;

            }



            // If currentSum becomes equal to sum,

            // then return true

            if (currentSum == s) {

                int p = i;

                ar.add(start+1);

                ar.add(p);

                return ar;

            }



            // Add this element to curr_sum

            if (i < n)

                currentSum = currentSum + arr[i];



            else{

                ar.add(-1);

            }

        }





        return ar;
        }
}
