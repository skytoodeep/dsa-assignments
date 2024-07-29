package assignments.arrays_05.easy;

//1. [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)


import java.util.Arrays;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] array = {5, 0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(calculatePermutation(array)));
    }

    private static int[] calculatePermutation(int[] array) {
        int[] result = new int[array.length];
        for (int i : array) {
            result[i] = array[array[i]];
        }
        return result;
    }
}