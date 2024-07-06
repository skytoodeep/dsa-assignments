package assignments.conditional_loops03.basics;

import java.util.Scanner;

public class FactorsNumber {
    //    23. Input a number and print all the factors of that number (use loops).
    //5*4*3*2*1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Factors of " + number + " are : ");
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
