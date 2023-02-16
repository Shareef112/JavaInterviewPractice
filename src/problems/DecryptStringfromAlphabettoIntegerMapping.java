package problems;

public class DecryptStringfromAlphabettoIntegerMapping {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
        System.out.println(freqAlphabets("1326#"));
    }

    public static String freqAlphabets(String s) {
        String result = "";
        for(int i=0;i< s.length();i++){
            if( i<s.length()-2&&s.charAt(i+2)=='#'){
                result = result+((char)('a'+Integer.parseInt(s.substring(i,i+2))-1));
                i=i+2;
            }
            else{
                result = result+(char)('a'+Integer.parseInt(String.valueOf(s.charAt(i)))-1);
            }

        }

            return result;
    }


}
