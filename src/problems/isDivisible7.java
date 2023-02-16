package problems;

public class isDivisible7 {
    public static void main(String[] args) {
        System.out.println(isdivisible7("1000"));
    }

    static int isdivisible7(String num){
        long n = Long.parseLong(num);
        System.out.println(n%7);
        if(n%7==0){
            return 1;
        }
        else{
            return 0;
        }

    }
}

