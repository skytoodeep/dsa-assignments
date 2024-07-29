package assignments.arrays_05.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

//9. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)
public class TargetArray09 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }

    private static int[] createTargetArray(int[] nums, int[] index) {
        int len = index.length;
        List<Integer> target = new ArrayList<>(len);
        for(int i=0;i<index.length;i++){
            target.add(index[i],nums[i]);
        }
        int[] array = new int[len];
        int j=0;
        for(int i : target){
            array[j] = i;
            j++;
        }
        return array;
    }
}
