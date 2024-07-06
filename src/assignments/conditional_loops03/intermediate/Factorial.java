package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

public class Factorial {
    //1. Factorial Program In Java
    //5*4*3*2*1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int factorial = 1;
        System.out.print("Factorial of " + number + " is " );
        while(number > 0){
            factorial *= number;
            System.out.print(number + " = ");
            number--;
        }
        System.out.println(" " + factorial);
    }
}
