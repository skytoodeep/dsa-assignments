package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

public class CalculateDepreciationValue {
//    8. Calculate Depreciation of Value
/*The value of any article or item subject to wear and tear, decreases with time. This decrease is called its Depreciation.
    Given three variable V1, R and T where V1 is the initial value, R is the rate of depreciation and T is the time in years.
    The task is to find the value of the item after T years.*/
//    V2 = V1[1-r/100]^t
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial value");
        float initialValue = input.nextFloat();
        System.out.println("Enter the rate of depreciation");
        float depreciationRate = input.nextFloat();
        System.out.println("Enter the number of years");
        int years = input.nextInt();
        double depreciationValue = initialValue*Math.pow((1-depreciationRate/100),years);
        System.out.println(depreciationValue);
    }
}
