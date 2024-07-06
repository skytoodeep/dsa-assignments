package assignments.conditional_loops03.basics;

import java.util.Scanner;

public class CalculateAreas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        1. Area Of Circle Java Program
//        areaOfCircle(input);
//        2. Area Of Triangle
//        areaOfTriangle(input);
//        3. Area Of Rectangle Program
//        areaOfRectangle(input);
//        4. Area Of Isosceles Triangle
//        areaOfIsoscelesTriangle(input);
//        5. Area Of Parallelogram
//        areaOfParallelogram(input);
//        6. Area Of Rhombus
//        areaOfRhombus(input);
//        7. Area Of Equilateral Triangle
//        areaOfEquilateralTriangle(input);
//        8. Perimeter Of Circle
//        perimeterOfCircle(input);
//        9. Perimeter Of Equilateral Triangle
//        perimeterOfEquilateralTriangle(input);
//        10. Perimeter Of Parallelogram
//        perimeterOfParallelogram(input);
//        12. Perimeter Of Square
//        perimeterOfSquare(input);
//        13. Perimeter Of Rhombus
//        perimeterOfRhombus(input);

    }

    private static void perimeterOfRhombus(Scanner input) {
        perimeterOfSquare(input);
    }

    private static void perimeterOfSquare(Scanner input) {
        System.out.println("Enter the side");
        float side = input.nextFloat();
        double area = 4* side;
        System.out.println(area);
    }

    private static void perimeterOfParallelogram(Scanner input) {
        System.out.println("Enter the sides of parallelogram");
        float side1 = input.nextFloat();
        float side2 = input.nextFloat();
        double perimeter = 2*(side1+side2);
        System.out.println(perimeter);
    }

    private static void perimeterOfEquilateralTriangle(Scanner input) {
        System.out.println("Enter the side");
        float side = input.nextFloat();
        double area = 3*side;
        System.out.println(area);
    }

    private static void perimeterOfCircle(Scanner input) {
        System.out.println("Enter the radius of the circle: ");
        float radius = input.nextFloat();
        double area = Math.PI*2*radius;
        System.out.println(area);
    }

    private static void areaOfEquilateralTriangle(Scanner input) {
        System.out.print("Enter the side: ");
        float side = input.nextFloat();
        double area = (Math.sqrt(3)*Math.pow(side,2))/4;
        System.out.println(area);
    }

    private static void areaOfRhombus(Scanner input) {
        areaOfTriangle(input);
    }

    private static void areaOfParallelogram(Scanner input) {
        areaOfRectangle(input);
    }

    private static void areaOfIsoscelesTriangle(Scanner input) {
        areaOfTriangle(input);
    }

    private static void areaOfRectangle(Scanner input) {
        System.out.print("Enter the length : ");
        float len = input.nextFloat();
        System.out.print("Enter the width : ");
        float width = input.nextFloat();
        double area = len * width;
        System.out.println(area);
    }


    private static void areaOfTriangle(Scanner input) {
        System.out.println("Enter the base length: ");

        int base = input.nextInt();
        System.out.println("Enter the height: ");
        int height = input.nextInt();
        double area = (double) (base * height) /2;
        System.out.println(area);
    }

    private static void areaOfCircle(Scanner input) {
        System.out.println("Enter the radius of the circle: ");
        float radius = input.nextInt();
        System.out.println("The area of the circle is "+(Math.pow(radius,2))*22/7);
    }
}
