package problems;

public class ReverseWordsInStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("God Ding"));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        for(String word : words){
            result = result+" "+reverse(word);
        }
        return result.substring(1);

    }

    public static String reverse(String s){
        String result="";
        for(int i = s.length()-1;i>=0;i--){
            result = result+s.charAt(i);
        }
        return result;
    }

}
