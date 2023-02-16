package problems;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(atoi("123"));
        System.out.println(atoi("21a"));
        System.out.println(atoi("01"));

    }

    public static int atoi(String str) {
        char[] chars = str.toCharArray();
        int result =0;
        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                return -1;
            }
            else{
                result = (result*10)+(c-'0');
            }
        }
        return result;
    }
}
