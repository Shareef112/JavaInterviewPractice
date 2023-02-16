package problems;

public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("F"));
        System.out.println(detectCapitalUse(" "));
        System.out.println(detectCapitalUse("f"));
        System.out.println(detectCapitalUse(""));



    }

    public static boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        int capital = 0;
        for(char c : chars){
            if(Character.isUpperCase(c)){
                capital++;
            }
        }
        if(capital == chars.length){
            return true;
        } else if (capital == 0) {
            return true;
        } else if (capital == 1 && Character.isUpperCase(chars[0])) {
            return true;
        }
        else {
            return false;
        }

    }
}
