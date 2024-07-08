package assignments.functions_04;
//6. [Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.]
// (https://beginnersbook.com/2014/01/java-program-to-calculate-area-and-circumference-of-circle/)

import java.util.Scanner;

public class AreaOfCircle06 {
    public static void main(String[] args) {
        System.out.println("Enter the radius of a circle: ");
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        System.out.println("area "+areOfCircle(radius));
        System.out.println(circumferenceOfCircle(radius));
    }

    private static double circumferenceOfCircle(float radius) {
        return 2 * Math.PI * radius * 10;
    }

    private static double areOfCircle(float radius) {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
}
