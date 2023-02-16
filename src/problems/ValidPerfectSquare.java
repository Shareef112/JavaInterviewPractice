package problems;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {
        long sum = 0;
        for (int i = 1; sum < num; i = i + 2) {
            sum = sum + i;
            if (sum == num) {
                return true;
            }
        }
        return false;
    }
}
