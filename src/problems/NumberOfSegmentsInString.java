package problems;

public class NumberOfSegmentsInString {
    public static void main(String[] args) {
        System.out.println(countSegments(", , , ,        a, eaefa"));
    }

    public  static int countSegments(String s) {
        int count =0;

        if(s.length()==0){
            return count;
        }
        else{
            String[] words = s.split(" ");
            for(String word: words){
                if(word.trim().length()>0){
                    count++;
                }
            }
        }
    return count;
    }
}
