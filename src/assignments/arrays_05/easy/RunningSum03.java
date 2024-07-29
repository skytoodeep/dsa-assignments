package assignments.arrays_05.easy;
/*1480. Running Sum of 1d Array
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/

import java.util.Arrays;

public class RunningSum03 {
    public static void main(String[] args) {
        int[] array = {-3,1,-2,10,-1};

        System.out.println(Arrays.toString(runningSum(array)));
    }

    private static int[] runningSum(int[] array) {
        int n = array.length;
        int total = 0;
        for(int i=0;i<n;i++){
            total = total + array[i];
            array[i] = total;
        }
        return array;
    }
}
