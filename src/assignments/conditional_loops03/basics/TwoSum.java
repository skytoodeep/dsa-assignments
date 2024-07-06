package assignments.conditional_loops03.basics;

import java.util.Scanner;

public class TwoSum {
//    26. Addition Of Two Numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Sum of the numbers is "+Math.addExact(firstNumber,secondNumber));
        System.out.println("Sum of the two number is " + Integer.sum(firstNumber,secondNumber));
    }
}
