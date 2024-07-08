package assignments.functions_04;
//10. [Write a function to find if a number is a palindrome or not. Take number as parameter.](https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/)

import java.util.Scanner;

public class Palindrome10 {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        palindromeOrNot(num);
    }

    private static void palindromeOrNot(int num) {
        int ans =0;
        int rem =0;
        int initais = num;
        while(num >0){
           rem =num%10;
           ans = ans*10+rem;
           num/=10;
        }
        if(ans == initais){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
}
