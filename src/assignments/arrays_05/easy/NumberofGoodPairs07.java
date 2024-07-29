package assignments.arrays_05.easy;
/*Given an array of integers nums, return the number of good pairs.A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.*/
public class NumberofGoodPairs07 {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(array));
    }

    private static int numIdenticalPairs(int[] array) {
        int pairs = 0;
        int temp=0;
        int len = array.length;
        int[] nums = new int[101];
        for(int i=0;i<array.length;i++){
           temp = array[i];
           if(nums[temp]!=0){
               pairs+=nums[temp];
           }
           nums[temp] =temp;
        }
        return pairs;
    }

    /*private static int numIdenticalPairs(int[] nums) {
        int pairs=0;
        for(int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    pairs++;
                }
            }
        }
        return pairs;
    }*/
}
