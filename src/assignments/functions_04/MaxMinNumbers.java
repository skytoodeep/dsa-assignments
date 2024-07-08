package assignments.functions_04;
//1. [Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.]
// (https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html)

import java.util.Scanner;

public class MaxMinNumbers {
    public static void main(String[] args) {
        System.out.println( "Enter the three numbers ");
        Scanner just = new Scanner(System.in);
        int num1 = just.nextInt();
        int num2 = just.nextInt();
        int num3 = just.nextInt();
        System.out.println("Maximum number is " + calculateMaximum(num1,num2,num3));
        System.out.println("Minimum number is " + calculateMinimum(num1,num2,num3));
    }

    private static int calculateMinimum(int num1, int num2, int num3) {
        int min = 0;
        min = Math.min((Math.min(num1,num2)),num3);
        return min;
    }

    private static int calculateMaximum(int num1, int num2, int num3) {
        int max =0;
        if(num1>num2){
            max = num1;
        }
        else{
            max = num2;
        }
        if(max>num3){
            return max;
        }
        return num3;
    }

}
