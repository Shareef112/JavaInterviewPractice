package problems;

public class PowerOfNumbers {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1));
        System.out.println(isPowerOfFour(1));

    }

    public static boolean isPowerOfThree(int n) {
        if( n == 0 ){
            return false;
        }
        int r = 0;

        while( n > 1 ){
            r = n % 3;
            if( r != 0 ){
                return false;
            }
            n = n / 3;
        }
        return n == 1 ?  true : false;
    }
    public static boolean isPowerOfFour(int n) {
        if( n == 0 ){
            return false;
        }
        int r = 0;

        while( n > 1 ){
            r = n % 4;
            if( r != 0 ){
                return false;
            }
            n = n / 4;
        }
        return n == 1 ?  true : false;
    }
}
