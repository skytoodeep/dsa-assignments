package assignments.conditional_loops03.basics;

import java.util.Scanner;

public class InputSum {
//    24. Take integer inputs till the user enters 0 and print the sum of all numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0 ;
        int number ;
        while(true){
            System.out.println("Enter a number to add");
            number = input.nextInt();
            sum+=number;
            if(number == 0){
                System.out.println("Total = "+sum);
                break;

            }
        }

    }
}
