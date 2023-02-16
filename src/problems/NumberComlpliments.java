package problems;

public class NumberComlpliments {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
        System.out.println(findComplement(1));
    }

    public static int findComplement(int num) {
        String strNum = Integer.toBinaryString(num);
        String tempNum = strNum.replaceAll("0","l");
        strNum = tempNum.replaceAll("1","0");
        strNum = strNum.replaceAll("l","1");

        return Integer.parseInt(strNum,2);

    }
}
