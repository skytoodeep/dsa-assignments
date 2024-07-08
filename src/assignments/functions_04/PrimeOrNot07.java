package assignments.functions_04;
//7. [Define a method to find out if a number is prime or not.]
// (https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/)

import java.util.Scanner;

public class PrimeOrNot07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        checkIfPrime(num);
    }

    private static boolean checkIfPrime(int num) {
        int divisor =2;
        int sqrt =(int) Math.sqrt(num);
        if(sqrt>0){
            while(divisor<=sqrt){
                if(num%divisor==0){
                    System.out.println("Number is not prime ");
                    return false;
                }
                else{
                    divisor++;
                }
            }
            System.out.println("Number is prime ");
        }
        return true;
    }
}
