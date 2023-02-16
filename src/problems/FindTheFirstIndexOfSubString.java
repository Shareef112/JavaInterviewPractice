package problems;

public class FindTheFirstIndexOfSubString {
    public static void main(String[] args) {
//        System.out.println(strStr("sadbutsad","sad"));
//        System.out.println(strStr("leetcode","leeto"));
//        System.out.println(strStr("a","a"));
//        System.out.println(strStr("abc","c"));
//        System.out.println(strStr("leetcode","de"));
        System.out.println(strStr("mississippi","issi"));

    }


    public static int strStr(String haystack, String needle) {
        if(haystack.equals(needle)){
            return 0;
        }

        int len = needle.length();
        for(int i=0;i<=haystack.length()-len;i++){
            if(haystack.substring(i,i+len).equals(needle)){
                return i;
            }
        }
        return -1;

    }
}
