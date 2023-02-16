package problems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        result = generate(5);
        System.out.println(result);
        System.out.println(getRow(0));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> resulti = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0){
                    resulti.add(1);
                }
                else if(j==i){
                    resulti.add(1);
                }
                else{
                    resulti.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
             result.add(resulti);
            }
         return result;

        }


    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> resulti = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            resulti = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0){
                    resulti.add(1);
                }
                else if(j==i){
                    resulti.add(1);
                }
                else{
                    resulti.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            result.add(resulti);
        }
        return resulti;


    }
}
