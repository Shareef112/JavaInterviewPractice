package problems;

public class IntegerToHexaDecimal {
    public static void main(String[] args) {
        System.out.println(toHex(-1));
    }

    public static String toHex(int num) {
        if(num == 0) return "0";
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder sb = new StringBuilder();
        while(num != 0){             // this could ensure there would not exist leading '0'
            sb.insert(0, map[num & 15]); // num & 15 ---> get the last 4 digit sum( surely < 16 )
            num = num >>> 4;        // >>> : unsigned right shift operator ">>>" shifts a zero into the leftmost position
        }
        return sb.toString();

    }
}
