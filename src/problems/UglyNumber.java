package problems;

public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(6));
    }

    public static boolean isUgly(int num) {
        if(num == 1) return true;
        if(num <= 0) return false;
        if(num % 2 == 0) return isUgly(num / 2);
        else if(num % 3 == 0) return isUgly(num / 3);
        else if(num % 5 == 0) return isUgly(num / 5);
        else return false;
    }

}
