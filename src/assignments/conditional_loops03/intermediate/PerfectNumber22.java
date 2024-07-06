package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

//22. Perfect Number In Java
public class PerfectNumber22 {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int factors =0;
        int temp =1;
        while(temp<number){
            if(number%temp == 0){
                factors+=temp;
            }
            temp++;
        }
        if(factors==number){
            System.out.println("Perfect number");
        }
        else {
            System.out.println("Not Perfect number");
        }
    }
}
