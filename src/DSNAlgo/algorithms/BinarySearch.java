package DSNAlgo.algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,10,20,47,59,65,75,88,99,100};
        System.out.println(search(nums,20));
        System.out.println(searchInsert(nums,60));
        System.out.println(searchInsert(nums,0));
        System.out.println(searchInsert(nums,101));


    }

    public static int search(int[] arr, int key){
        int low =0;
        int high = arr.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(key < arr[mid]){
                high = mid -1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }

    //Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    public static int searchInsert(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        while(low <=high){
            int mid = low +(high-low)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(key < arr[mid]){
                high = mid -1;
            }
            else {
                low = mid+1;
            }
        }
        return low;
    }
}
