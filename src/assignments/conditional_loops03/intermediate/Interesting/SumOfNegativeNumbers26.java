package assignments.conditional_loops03.intermediate.Interesting;

import java.util.Scanner;

//26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of odd numbers
// positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
public class SumOfNegativeNumbers26 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers ");
        Scanner input = new Scanner(System.in);
        int negativesTotal =0;
        int positiveEvens = 0;
        int positiveOdds = 0;
        while(true){
            int temp = input.nextInt();
            if(temp !=0){
                if(temp<0){
                    negativesTotal+=temp;
                }
                else if(temp>0){
                    if(temp%2==0){
                        positiveEvens+=temp;
                    }else{
                        positiveOdds+=temp;
                    }
                }
            }
            else{
                System.out.println("Negative Total "+negativesTotal+"Positive Evens "+positiveEvens+"Positive Odds "+positiveOdds);
            }
        }
    }
}
