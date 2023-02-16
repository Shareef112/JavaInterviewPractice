package problems;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
        System.out.println(mergeAlternately("ab","pqrs"));
        System.out.println(mergeAlternately("abcd","pq"));
    }

    public static String mergeAlternately(String word1, String word2) {
        boolean flag = true;
        int start = 0;
        String result = "";
        while(flag){
            if(start < word1.length()){
                result = result+word1.charAt(start);
            }
            if(start < word2.length()){
                result = result+word2.charAt(start);
            }
            if(start >= word1.length() && start >= word2.length() ){
                flag = !flag;
            }
            start++;
        }

        return result;

    }
}
