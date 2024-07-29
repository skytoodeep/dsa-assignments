package assignments.arrays_05.easy;

import java.util.Arrays;

//21. [Two Sum](https://leetcode.com/problems/two-sum/)
public class TwoSum21 {
    public static void main(String[] args) {
       int[] nums = {2,5,5,11};
       int target =10;
        System.out.println(Arrays.toString(twoSumBinary(nums, target)));
    }

    private static int[] twoSumBinary(int[] nums, int target) {
        for (int i=0,j=i+1;j< nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            } else if (j+1== nums.length) {
                i++;
                j=i;
            }
        }
        return new int[] {};
    }

    private static int[] twoSumLinearSearch(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
