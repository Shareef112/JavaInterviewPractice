package problems;

public class MatrixSprialPrint {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60},{61,62,63,64}};
        spiralMatrix(matrix,4,4);
    }

    public static void spiralMatrix(int[][] matrix, int r, int c){
        int i,k=0,l=0;
        while(k<r&&l<c){
            for(i=l;i<c;i++){
                System.out.print(matrix[k][i]+" ");
            }
            k++;
            for(i=k;i<r;i++){
                System.out.print(matrix[i][c-1]+" ");
            }
            c--;
            if(k<r){
                for(i=c-1;i>=l;i--){
                    System.out.print(matrix[r-1][i]+" ");
                }
                r--;
            }
            if(l<c){
                for(i=r-1;i>=k;i--){
                    System.out.print(matrix[i][l]+" ");
                }
                l++;
            }
        }
    }
}
