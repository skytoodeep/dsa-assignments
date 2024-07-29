package assignments.arrays_05.easy;
//20. [Determine Whether Matrix Can Be Obtained By Rotation](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/)

import java.util.Arrays;

public class MatrixRotation20 {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(findRotationMatrix(mat, target));
    }

    private static boolean findRotationMatrix(int[][] mat, int[][] target) {
        boolean flag = false;
        int count=0;
        int[][] transpose=new int[mat.length][mat[0].length];
        for(int i=0,m=mat.length-1;i<mat.length;i++,m--){
            for(int j=0,n=mat.length-1; j<mat[i].length;j++,n--){
                transpose[j][m] = mat[i][j];
                transpose[i][j] = mat[j][m];
            }
        }
        return flag;
    }

    private static boolean findRotation(int[][] mat, int[][] target) {
        boolean flag = false;
        int matLen = mat.length;
        int rem;
        int left;
        int count = 0;
        while (count != 3) {
            for (int i = 0; i < matLen - 1; i++) {
                for (int j = 0; j < mat[i].length - 1; j++) {
                    rem = mat[i][j + 1];
                    mat[i][j + 1] = mat[i][j];
                    left = mat[i + 1][j + 1];
                    mat[i + 1][j + 1] = rem;
                    rem = mat[i + 1][j];
                    mat[i + 1][j] = left;
                    mat[i][j] = rem;
                }
            }
            for (int i = 0; i < matLen; i++) {
                if (Arrays.equals(mat[i], target[i])) {
                    flag = true;
                } else {
                    flag = false;
                    count++;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return flag;
    }
}
