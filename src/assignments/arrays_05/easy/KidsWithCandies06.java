package assignments.arrays_05.easy;
/*There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
and an integer extraCandies, denoting the number of extra candies that you have.Return a boolean array result of length n, where result[i] is true if,
after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.
        Example 1:
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.*/

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class KidsWithCandies06 {
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        System.out.printf(kidsWithCandies(candies,extraCandies).toString());;
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        int n =candies.length;
        /*final int[] original = candies;
        Arrays.sort(candies);
        List<Boolean> list = new LinkedList<>();
        int maximum = candies[n-1];*/
        List<Boolean> list = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(candies[i] > max){
                max = candies[i];
            }
            else if(max >= candies[i]){
                continue;
            }
        }
        for(int i=0;i<n;i++){
            if((candies[i]+extraCandies)>=max){
                list.add(i,true);
            }
            else{
                list.add(i,false);
            }
        }
        return list;
    }
}
