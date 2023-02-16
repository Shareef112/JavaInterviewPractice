package problems;

public class CountOfConsistentStrings {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
    }


    public static int countConsistentStrings(String allowed, String[] words) {
        int result =0;
        for(String word : words){
            if(isConsistentString(allowed,word)){
                result++;
            }
        }

        return result;
    }

    static Boolean isConsistentString(String str1,String str2){
        for(int i=0;i<str2.length();i++){
            if(!str1.contains(String.valueOf(str2.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
