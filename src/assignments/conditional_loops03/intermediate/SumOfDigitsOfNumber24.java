package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

//24. Sum Of A Digits Of Number
public class SumOfDigitsOfNumber24 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number= input.nextInt();
        int sum = 0;
        while(number>0){
            int temp = number%10;
            sum+=temp;
            number/=10;
        }
        System.out.println("The sum of digits of number is "+sum);
    }
}
