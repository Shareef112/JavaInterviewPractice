package DSNAlgo.algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums ={5,1,9,2,10,15,20};
        System.out.println(search(nums,nums.length,2));
    }


    public static int search(int[] arr, int n, int value){
        for(int i=0;i<n;i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}
