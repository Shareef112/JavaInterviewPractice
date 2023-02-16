package problems;

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }

    public static int arrangeCoins(int n) {
        int result =0;
        int temp =n;
        for(int i=1;i<=n;i++){
            result++;
            n = n-i;

        }
      return result;
    }
}
