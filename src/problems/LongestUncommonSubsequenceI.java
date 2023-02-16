package problems;

public class LongestUncommonSubsequenceI {

    public static int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());

    }


}
