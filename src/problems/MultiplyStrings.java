package problems;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("2","3"));
       System.out.println(multiply("123","456"));
        System.out.println(multiply("123456789","987654321"));
    }

    public static String multiply(String num1, String num2) {
        int n1 =0, n2=0;
        for(int i=0;i<num1.length();i++){
            n1 = (n1*10)+(num1.charAt(i)-'0');
        }
        for(int i=0;i<num2.length();i++){
            n2 = (n2*10)+(num2.charAt(i)-'0');
        }

        long result = (long)n1*n2;


        return  Long.toString(result);

    }
}
