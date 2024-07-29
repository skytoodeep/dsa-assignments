package assignments.arrays_05.easy;

import java.util.Arrays;

//13. [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)
public class FlippingImage13 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        image = flipAndInvertImage(image);
        for(int[] ag:image){
                    System.out.println(Arrays.toString(ag));
        }
    }

    private static int[][] flipAndInvertImage(int[][] image) {

        int first;
        int second;
        int n =image.length;
        boolean flag=false;
        for(first=0;first<n; first++){
            second = image[first].length;
            int temp ;
            if(second==1){
                flag=true;
            }
            for(int j=0,i=image[first].length-1;j<i;j++,i--){
                temp = image[first][j];
                image[first][j] = image[first][i];
                image[first][i] = temp;
                if(second%2==0 ){
                    if(i-j==1){
                        flag=true;
                    }
                } else if (i-(j+1)==1) {
                    flag=true;
                }
            }
            if(flag){
                for (int j=0;j<second;j++){
                        if(image[first][j]==0){
                            image[first][j] =1;
                        }
                        else if(image[first][j]==1){
                            image[first][j] =0;
                        }
                }
            }
        }
        return image;
    }
}
