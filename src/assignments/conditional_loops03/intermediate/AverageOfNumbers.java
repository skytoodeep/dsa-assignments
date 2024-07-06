package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
//        3. Calculate Average Of N Numbers
//        12. Calculate Average Marks
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of numbers: ");
        int noOfNumbers = input.nextInt();
        int total = 0;
        for (int i = 0; i < noOfNumbers; i++) {
            int temp = input.nextInt();
            total += temp;
//            System.out.print(temp + " ");
        }
        System.out.print( "= "+total/noOfNumbers+" ");
    }
}
