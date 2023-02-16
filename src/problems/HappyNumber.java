package problems;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));

        }while (slow !=fast);

       return slow == 1;
    }
    public static int squareSum(int n){
        int rem =0;
        int output =0;
        while(n >0){
            rem = n%10;
            output = output +(rem*rem);
            n=n/10;
        }
        return output;

    }
}
