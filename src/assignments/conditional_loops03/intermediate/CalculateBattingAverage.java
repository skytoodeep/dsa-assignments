package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

public class CalculateBattingAverage {
//    9. Calculate Batting Average
    public static void main(String[] args) {
        System.out.println("Enter the nummber of runs ");
        Scanner input = new Scanner(System.in);
        int runs = input.nextInt();
        System.out.println("Enter the number of innings where the batsman got out ");
        int innings = input.nextInt();
        float battingAverage = (float) runs / innings;
        System.out.println(battingAverage);
    }
}
