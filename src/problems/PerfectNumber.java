package problems;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }

    public static boolean checkPerfectNumber(int num) {
        if (num < 6 || num%2 != 0) {
            return false;
        }
        int sum = 1;
        for (int i=2; i<=num/2; i++) {
            if (num%i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
