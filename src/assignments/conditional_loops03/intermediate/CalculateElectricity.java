package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

public class CalculateElectricity {
//    2. Calculate Electricity Bill
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units of electricity : ");
        int units = sc.nextInt();
        float unitRate = 5.17f;
        int fixedCharge = 121;

        float bill = (units * unitRate) + fixedCharge;
        System.out.println("The bill is " + bill);
    }
}
