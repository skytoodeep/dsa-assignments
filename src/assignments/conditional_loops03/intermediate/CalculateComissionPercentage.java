package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

public class CalculateComissionPercentage {
//    6. Calculate Commission Percentage
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total amount: ");
        float amount = input.nextFloat();
        System.out.println("Enter the comissioned amount");
        float comission = input.nextFloat();
        System.out.println("Percentage is " + " " +(comission* 100)/amount);
    }
}
