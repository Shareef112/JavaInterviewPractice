package problems;

import java.util.ArrayList;

public class LeadersInArray {

    public static void main(String[] args) {
       int n = 6;
       int arr[] = {16,17,4,3,5,2};
        System.out.println(leaders(arr,n));
    }


    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList <Integer> ans = new ArrayList<Integer>();

        ans.add(arr[n-1]);

        for(int i = n-2 ; i >=0 ; i--)

        {
            int leader =  ans.get(ans.size()-1);
            while(i >= 0 && arr[i] < leader )
            {
                i--;
            }
            if(i >=0)
                ans.add(arr[i]);
        }

        // reverse the list

        for(int i = 0 , j = ans.size()-1 ; i<j; i++, j--)
        {
            int temp = ans.get(i);
            ans.set(i,ans.get(j));
            ans.set(j ,temp);

        }
        return ans;
    }
}
