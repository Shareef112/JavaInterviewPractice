package problems;

public class validPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String input = s.replaceAll(" ","").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        return input.equals(input1.reverse().toString());
    }
}
