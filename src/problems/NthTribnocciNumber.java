package problems;

public class NthTribnocciNumber {
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

    public static int tribonacci(int n) {
        int[] fibnocci = new int[n+1];
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        fibnocci[0]=0;
        fibnocci[1]=1;
        fibnocci[2]=1;
        for(int i=3;i<=n;i++){
            fibnocci[i] = fibnocci[i-1]+fibnocci[i-2]+fibnocci[i-3];
        }


        return fibnocci[n];

    }
}
