package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

public class CompoundInterest {
//    11. Compound Interest Java Program
    //ci= CI = P (1 + r/n)nt - P.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal amount ");
        long principal = input.nextLong();
        System.out.println("Enter the interest rate ");
        float interestRate = input.nextFloat();
        System.out.println("Enter the number of years ");
        int timePeriod = input.nextInt();
        System.out.println("Enter the compounding time : (A/H/Q)(A for annually, H for half yearly and Q for quarterly)");
        int time=0;
        switch (input.next().charAt(0)){
            case 'A'-> { time = 1;}
            case 'H' ->{time=2;}
            case 'Q' -> {time =4;}
            default -> {
                System.out.println("Invalid input");
                break;
            }
        }
        double compoundInterest = (principal * Math.pow((1+(interestRate/time)), (timePeriod*time))) - principal;
        System.out.println(compoundInterest);
    }
}
