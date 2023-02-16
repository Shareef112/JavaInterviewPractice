package problems;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(transpose(new int[][]{{1,2,3},{4,5,6}})));
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] result = new int[columns][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                result[j][i] = matrix[i][j];
            }

        }
        return result;

    }

}
