package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

//18. Future Investment Value
public class FutureInvestmentValue18 {
//    FV=PV*(1+i)*n
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the present value: ");
        int pv = input.nextInt();
        System.out.println("Enter the rate of interest: ");
        float rate = input.nextFloat()/100;
        System.out.println("Enter the years of interest: ");
        int years = input.nextInt();

        double futureInvestmentValue = pv*(1+rate)*years;
        System.out.println(futureInvestmentValue);
    }
}
