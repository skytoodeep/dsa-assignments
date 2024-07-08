package assignments.functions_04;

import java.util.Scanner;

/*14. [Write a function that returns the sum of first n natural numbers.]
        (https://www.geeksforgeeks.org/program-find-sum-first-n-natural-numbers/)*/
public class SumOfNNumbers14 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        int count = 0;
        while(sum<=number){
            count+=sum;
            sum++;
        }
        System.out.println(count);
    }
}
