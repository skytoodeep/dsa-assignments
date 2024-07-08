package assignments.functions_04;

import java.util.Scanner;

//[Write a program to print the factorial of a number by defining a method named 'Factorial'.](
public class Factorial09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number =  input.nextInt();
        findFactorial(number);
    }

    private static void findFactorial(int number) {
        int fact =1;
        int temp =1;
        while(number !=0 && temp<=number){
            fact*=temp;
            temp++;
        }
        System.out.println("Factorial of "+number+" is "+fact);
    }
}
