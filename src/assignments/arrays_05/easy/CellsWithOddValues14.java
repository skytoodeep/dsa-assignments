package assignments.arrays_05.easy;
//14. [Cells with Odd Values in a Matrix](https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/)
public class CellsWithOddValues14 {
    public static void main(String[] args) {
        int[][] indices={{1,1},{0,0}};
        int m=1,n=1;
        System.out.println(oddCells(indices,m,n));
    }

    private static int oddCells(int[][] indices, int m, int n) {
        int[][] matrix = new int[m][n];
        int first;
        int second;
        int count=0;
        for(int i=0;i<indices.length;i++){
            first = indices[i][0];
            second = indices[i][1];
            matrix=rowIncremento(first,matrix);
            matrix = columnIncrementor(second,matrix);
        }
        for(int i=0;i<m;i++){
           for (int j=0;j<n;j++){
               if (matrix[i][j]%2!=0){
                   count++;
               }
           }
        }
        return count;
    }

    private static int[][] columnIncrementor(int incrementBy, int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            matrix[i][incrementBy]++;
        }
        return matrix;
    }
    private static int[][] rowIncremento(int incrementBy,int[][] mattrix) {

            for(int j=0;j<mattrix[incrementBy].length;j++){
                mattrix[incrementBy][j]++;
            }
            return mattrix;
    }


}
