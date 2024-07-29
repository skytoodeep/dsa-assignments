package assignments.arrays_05.easy;
//15. [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/)
public class MatrixDiagonalSum15 {
    public static void main(String[] args) {
        int[][] mat = {{7,3,1,9},{3,4,6,9},{6,9,6,6},{9,5,8,5}};
        System.out.println(diagonalSum(mat));
    }

    private static int diagonalSum(int[][] mat) {
        int sum =0;
        int mid=0;
        int len = mat.length;
        if(len==1){
            return mat[0][0];
        }
        if(len%2!=0){
            mid = len/2;
        }
        for(int i=0,j=len-1;i<len;i++,j--){

            sum+=mat[i][i];
            sum+=mat[i][j];
        }
        if(mid!=0){
                mid = mat[mid][mid];
                sum-=mid;
        }
        return sum;
    }
}
