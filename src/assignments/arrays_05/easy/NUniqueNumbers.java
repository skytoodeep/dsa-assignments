package assignments.arrays_05.easy;

import java.util.Arrays;
import java.util.Random;

//22. [Find N Unique Integers Sum up to Zero](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)
public class NUniqueNumbers {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    private static int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n==1){
            int[] array ={0};
            return array;
        }
        Random randm = new Random();
        int total=0;
        boolean flag =false;
        for(int i=0;i<n-1;i++){
            int temp =randm.nextInt();
            arr[i]=temp;
            arr[i+1]=-temp;
            i++;
        }
        return arr;
    }
}
