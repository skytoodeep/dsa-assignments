package assignments.arrays_05.easy;

import java.util.Arrays;

//17. [Transpose Matrix](https://leetcode.com/problems/transpose-matrix/)
public class TransposeMatrix17 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6},{7,8,9}};
        matrix = transposeInt(matrix);
        for (int[] mat : matrix) {
            System.out.println(Arrays.toString(mat));
        }
    }

    private static int[][] transposeInt(int[][] matrix) {
        int i=matrix.length;
        int j = matrix[0].length;
        int[][]transposed= new int[j][i];
        for(int k=0;k<i;k++){
            for (int p=0;p<j;p++)
                transposed[p][k]=matrix[k][p];
        }
        return transposed;
    }

    private static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        if (row == column) {
            for (int i = 0; i < row; i++) {
                for (int j = row - 1; j > i; j--) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

        } else {
            int[][] transpose = new int[column][row];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }
            return transpose;
        }
        return matrix;
    }
}
