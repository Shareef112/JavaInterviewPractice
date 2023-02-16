package problems;

public class SignoftheProductofanArray {
    public static void main(String[] args) {
       System.out.println(arraySign(new int[]{41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41}));
        System.out.println(arraySign(new int[]{9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24}));

    }

    public static int arraySign(int[] nums) {
        long negative = 0;
        for(int n : nums){
            if(n == 0){
                return 0;
            }
            else if(n<0){
                negative++;
            }

        }

        return negative %2 ==0 ? 1:-1;

    }
}
