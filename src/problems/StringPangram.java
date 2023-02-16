package problems;

public class StringPangram {
    public static void main(String[] args) {
        System.out.println(checkPangram("Bawds jog, flick quartz, vex nymph"));
    }

    public static boolean checkPangram  (String str) {
        if(str.length()<26){
            return false;
        }
        char smallCh = 'a';
        char capCh = 'A';
        while(smallCh <='z'){
            if(!str.contains(String.valueOf(smallCh)) && !str.contains(String.valueOf(capCh))){
                return false;
            }
            smallCh++;
            capCh++;
        }
        return true;
    }
}
