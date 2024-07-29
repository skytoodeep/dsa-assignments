package assignments.arrays_05.easy;
//12. [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)
public class FindHighestAltitude12 {
    public static void main(String[] args) {
        int[] gain ={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

    private static int largestAltitude(int[] gain) {
        int max = 0;
        int min =0;
        for (int i=0;i<gain.length;i++){
            min+=gain[i];
            if(min>max){
                max=min;
            }
        }
        return max;
    }
}
