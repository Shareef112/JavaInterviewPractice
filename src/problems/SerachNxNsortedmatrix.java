package problems;

public class SerachNxNsortedmatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60},{61,62,63,64}};
        System.out.println(search(matrix,4,63));

    }

    public static boolean search(int[][] matrix, int n, int value){
        int i=0;
        int j = n-1;
        while(i<n && j>=0){
            if(matrix[i][j] == value){
                System.out.println(value+" is found at "+i+" , "+j);
                return true;
            }
            else if(matrix[i][j] >value){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
