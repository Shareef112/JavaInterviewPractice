package problems;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber >0 ){
            sb.append((char)('A' + (--columnNumber)%26));
            columnNumber = columnNumber/26;
        }
        return sb.reverse().toString();

    }
}
