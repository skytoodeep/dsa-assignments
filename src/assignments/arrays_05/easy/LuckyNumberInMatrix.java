package assignments.arrays_05.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//23. [Lucky Number In a Matrix](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)
public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(matrix));
    }

    private static List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> aList = new ArrayList<>();
        int row;
        int min;
        int max;
        for(int i=0;i<matrix.length;i++){
            min=matrix[i][0];
            row=0;
            for(int j=0;j<matrix[i].length;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                    row=j;
                }
            }
            max = matrix[0][row];
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][row]>max){
                    max=matrix[j][row];
                }
            }
            if(min==max){
                aList.add(min);
            }
        }
        return aList;
    }
}
