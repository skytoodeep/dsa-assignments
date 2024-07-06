package assignments.first_java_02;

import java.util.Scanner;

public class FirstJavaDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        1. Write a program to print whether a number is even or odd, also take input from the user.
//        evenOdd(input);
//        2. Take name as input and print a greeting message for that particular name.
//        takeName(input);
//        3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        calculateInterest(input);
//        4. Take in two numbers and an operator (+, -, *, /) and calculate the value. //(Use if conditions)
//        calculateOperation(input);
//        5. Take 2 numbers as input and print the largest number.
//          compareInts(input);
//        6. Input currency in rupees and output in USD.
//          currancyExchange(input);
//        7. To calculate Fibonacci Series up to n numbers.
//        fibonacci(input);
//        8. To find out whether the given number is Palindrome or not.
//        (intermediate) 17. Find if a number is palindrome or not
        checkPalindrome(input);

        //9. To find Armstrong Number between two given number.
//        Intermediate 14. Armstrong Number In Java
//        findArmStrong(input);
    }
    private static void checkPalindrome(Scanner input) {

        int temp =0;
        int reverse =0;
        int number = input.nextInt();
        int mainNumber = number;
//        int loopedNumber = ((Integer) number).toString().length();
        while(number>0){
            temp = number%10;
            number/=10;
            reverse=reverse*10+temp;
        }
        if(mainNumber==reverse){
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }

    private static void findArmStrong(Scanner input) {
//        14. Armstrong Number In Java
        System.out.println("Enter the nummbers : ");
        String num1 = input.next();
        String num2 = input.next();
        int  number1 =Integer.parseInt(num1);
        int number2= Integer.parseInt(num2);
        int num1_len=num1.length();
        int num2_len=num2.length();
        int total;
        if(number1>0){
            int temp=0;
            total =0;
            for(int i=0;i<num1_len;i++){
                temp=(int) Math.pow(Integer.parseInt(String.valueOf(num1.charAt(i))), num1_len);
                total=total+temp;
            }
            if(total==number1){
                System.out.println("Number1 is Armstrong");
            }
            else {
                System.out.println("Number 1 is not Armstrong");
            }
        }
        if(number2>0){
            int temp=0;
            total =0;
            for(int i=0;i<num2_len;i++){
                temp=(int) Math.pow(Integer.parseInt(String.valueOf(num2.charAt(i))), num1_len);
                total+=temp;
            }
            if(total==number2){
                System.out.println("Number2 is Armstrong");
            }
            else {
                System.out.println("Number 2 is not Armstrong");
            }
        }
        //371
    }



    private static void fibonacci(Scanner input) {
        int first = 0;
        int second = 1;
        int number = input.nextInt();
        //0,1,1,2,3,5,8,13
        //first:0,1,1,2,3,5,8
        //second:1,0,1,1,2,3,5
        System.out.print(first+" "+second+" ");
        for (int i = 2; i < number; i++) {
            int temp = first + second;
            System.out.print(temp+" ");
            first = second;
            second = temp;

        }
    }

    private static void currancyExchange(Scanner input) {
        System.out.println("Enter the amount ");
        int inr = input.nextInt();
        System.out.println("Amount in usd is " + inr/83.49);
    }

    private static void compareInts(Scanner input) {
        System.out.println("Enter the two numbers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("The largest number is " + Math.max(num2,num1));
    }

    private static void calculateOperation(Scanner input) {
        System.out.println("Enter the two number ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Enter the operation ");
        char operation = input.next().charAt(0);
        int ans = 0;
        if(operation =='+'){
           ans = num1+num2;
        }
        else if(operation =='*'){
            ans = num1+num2;
        }
        else if(operation =='-'){
            ans = num1-num2;
        }
        else if(operation =='/'){
            ans = num1/num2;
        }
        else{
            System.out.println("Invalid operation");
        }
        System.out.println("Result : "+ans);
    }

    private static void calculateInterest(Scanner input) {
        System.out.println( "Enter the principal amount ");
        double principal = input.nextDouble();
        System.out.println("Enter the time ");
        int time = input.nextInt();
        System.out.println("Enter the roi ");
        float roi = input.nextFloat();

        double interest = (principal * time * roi)/100;
        System.out.println("The interest is " + interest);
    }

    private static void takeName(Scanner input) {

        String name = input.next();
        System.out.println("Hello, welcome !" + name);
    }

    static void evenOdd(Scanner input){
        int number = input.nextInt();
        System.out.println("The number is even: " + (number%2==0));
    }
}
