package problems;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        int result =0;
        int sum = num;
        do{
            result = addNums(sum);
            sum = result;

        }
        while(result >9);
        return result;

    }

    public static int addNums(int num){
        int result =0;
        int rem =0;
        while(num>0){
            rem = num%10;
            result = result+rem;
            num = num/10;

        }
        return result;
    }
}
