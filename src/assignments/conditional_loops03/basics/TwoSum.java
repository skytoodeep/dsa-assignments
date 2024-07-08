package assignments.conditional_loops03.basics;

import java.util.Scanner;

public class TwoSum {
//    26. Addition Of Two Numbers
//    (04-functions). [Write a program to print the sum of two numbers entered by user by defining your own method.](https://code4coding.com/addition-of-two-numbers-in-java-using-method/)

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
