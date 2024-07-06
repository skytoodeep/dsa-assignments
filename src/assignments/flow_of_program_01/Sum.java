package assignments.flow_of_program_01;

import java.util.Scanner;

//2. Take two numbers and print the sum of both.

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("The sum of both numbers is "+(num1+num2));
    }
}
