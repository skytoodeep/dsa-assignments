package assignments.arrays_05.easy;
//16. [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
public class EvenNumbersDigits16 {
    public static void main(String[] args) {
       int[] nums = {437,315,322,431,686,264,442};
        System.out.println(findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int count;
        int total=0;
        for(int number:nums){
            count=0;
            while(number>0){
                count++;
                number/=10;
            }
            if(count%2==0){
                total++;
            }
        }
        return total;
    }
}
