package problems;

public class JewelsandStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
        System.out.println(numJewelsInStones("z","ZZ"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count =0;
        for(int i=0;i<stones.length();i++){
            if(jewels.contains(String.valueOf(stones.charAt(i)))){
                count++;
            }
        }
        return count;

    }
}
