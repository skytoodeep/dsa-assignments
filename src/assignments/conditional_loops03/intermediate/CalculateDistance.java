package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

public class CalculateDistance {
//    5. Calculate Distance Between Two Points
    //d=√[(x2-x1)^2+(y2-y1)^2]
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x1 :");
        int x1 = input.nextInt();
        System.out.println("Enter the value of y1 :");
        int y1 = input.nextInt();
        System.out.println("Enter the value of x2 :");
        int x2 = input.nextInt();
        System.out.println("Enter the value of y2 :");
        int y2 = input.nextInt();
        double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
        System.out.println("The distance between the two points is : " + distance);
    }
}
