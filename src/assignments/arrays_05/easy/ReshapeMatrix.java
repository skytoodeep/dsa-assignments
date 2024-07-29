package assignments.arrays_05.easy;
//25. [Reshape the Matrix](https://leetcode.com/problems/reshape-the-matrix/)
public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int r=1,c=4;
        System.out.println(matrixReshape(mat,r,c));
    }

    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] reshape ;
        int columnCount = mat[0].length;
        int rowCount=mat.length;
        if((rowCount*columnCount)/r == c){
            reshape= new int[r][c];
            for(int i=0;i<rowCount;i++){
                for (int j=0;j<columnCount;j++){
                    reshape[i][j]=mat[i][j];
                }
            }
        }
        return mat;
    }
}
