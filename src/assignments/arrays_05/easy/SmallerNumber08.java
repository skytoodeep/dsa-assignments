package assignments.arrays_05.easy;
//8. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)

import java.util.Arrays;

public class SmallerNumber08 {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));;
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        for(int i=0,j=0;i<n;j++){
            if(nums[i]>nums[j]){
                    array[i]++;
            }
            if(j==(n-1)){
                i++;
                j=-1;
            }
        }
        return array;
    }
}
