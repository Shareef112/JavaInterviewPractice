package problems;

public class StudentAttendenceRecord {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
        System.out.println(checkRecord("LALL"));
    }

    public static boolean checkRecord(String s) {
        int aCount =0;
        int lateCount=0;
        boolean lateFlag = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                aCount++;
            } else if (lateFlag && s.charAt(i) == 'L') {
                lateCount++;

            } else if (!lateFlag && s.charAt(i) == 'L') {
                if(lateCount <3){
                    lateCount =1;
                }
                lateFlag = true;

            }
            if (lateFlag && s.charAt(i) !='L') {
                lateFlag = false;

            }

        }
        return aCount < 2 && lateCount < 3;

    }
}
