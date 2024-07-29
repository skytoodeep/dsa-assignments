package assignments.arrays_05.easy;

//19. [Maximum Population Year](https://leetcode.com/problems/maximum-population-year/)
public class MaximumPopulationYear19 {
    public static void main(String[] args) {
        int[][] logs = {{2033, 2034}, {2039, 2047}, {1998, 2042}, {2047, 2048}, {2025, 2029}, {2005, 2044}, {1990, 1992}, {1952, 1956}, {1984, 2014}};
        System.out.println(maximumPopulation(logs));
    }

    private static int maximumPopulation(int[][] logs) {
        int[] year = new int[2051];
        int birth=0;
        int death = 1;
        for (int i = 0; i < logs.length; i++) {
            birth = logs[i][0];
            death = logs[i][1];
            for (int j = birth; j < death; j++) {
                year[j]++;
            }
        }
        int maxPop = 0;
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                if (year[j] > year[maxPop]) {
                    maxPop = j;
                }
                else if(year[j] == year[maxPop] && j<maxPop){
                    maxPop=j;
                }
            }
        }
        return maxPop;
    }
}
