package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

public class CalculateDiscount {
//    4. Calculate Discount Of Product
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the original price of the product: ");
        float price = input.nextFloat();
        System.out.println("Enter the discounted price of the product: ");
        float discountedPrice = input.nextFloat();

        float percentage = (discountedPrice*100)/price;
        System.out.println(percentage);
    }
}

