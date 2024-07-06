package assignments.conditional_loops03.basics;

import java.util.Scanner;

public class NumberLargestInput {
//25. Take integer inputs till the user enters 0 and print the largest number from all.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int largest = 0;
        while(true){
            System.out.print("Enter a number: ");
            number = input.nextInt();
            largest = Math.max(number,largest);
            if (number==0){
                System.out.println("Largest number is: " + largest);
                break;
            }
        }
    }
}
