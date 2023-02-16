package problems;

public class FindthePivotInteger {
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
        System.out.println(pivotInteger(1));
        System.out.println(pivotInteger(4));
    }

    public static int pivotInteger(int n) {
        int sum = 0;

          for(int i=n;i>0;i--){
              int first = (i*(i+1))/2;
              sum = sum+i;
              if(sum == first){
                  return i;
              }
          }
          return -1;

    }
}
