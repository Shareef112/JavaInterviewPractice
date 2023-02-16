package problems;

public class HammingHeight {
    public static void main(String[] args) {
        int n =-31;
        System.out.println(hammingWeight(n));

    }
    public static int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
