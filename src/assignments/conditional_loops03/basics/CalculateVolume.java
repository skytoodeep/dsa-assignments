package assignments.conditional_loops03.basics;

import java.util.Scanner;

public class CalculateVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        14. Volume Of Cone Java Program
//        volmOfCone(input);
//        15. Volume Of Prism
//        volmOfPrism(input);
//        16. Volume Of Cylinder
//        volmOfCylinder(input);
//        17. Volume Of Sphere
//        volmOfSphere(input); 
//        18. Volume Of Pyramid
//        volmOfPyramid(input); 
//        19. Curved Surface Area Of Cylinder
//        surfaceAreaOfCylinder(input);
//        20. Total Surface Area Of Cube
//        surfaceAreaOfCube(input);

    }

    private static void surfaceAreaOfCube(Scanner input) {
        System.out.println("Enter the side of the cube:");
        float side = input.nextFloat();
        double area = 4 * Math.pow(side,2);
        System.out.println(area);
    }

    private static void surfaceAreaOfCylinder(Scanner input) {
        System.out.println("Enter the radius of the cylinder: ");
        float radius = input.nextFloat();
        System.out.println("Enter the height of the cylinder: ");
        float height = input.nextFloat();
        double area= 2*(Math.PI*radius*height);
        System.out.println(area);
    }

    private static void volmOfPyramid(Scanner input) {
        System.out.println("Enter the length of Pyramid ");
        float length = input.nextFloat();
        System.out.println("Enter the width of Pyramid ");
        float width = input.nextFloat();
        System.out.println("Enter the height of Pyramid ");
        float height = input.nextFloat();
        double volume = (length * width * height)/3;
        System.out.println(volume);
    }

    private static void volmOfSphere(Scanner input) {
        System.out.println("Enter the radius of the cone: ");
        float radius = input.nextFloat();
        double volume = (Math.PI * Math.pow(radius, 3))*4/3;
        System.out.println(volume);
    }

    private static void volmOfCylinder(Scanner input) {
        System.out.println("Enter the radius of the cone: ");
        float radius = input.nextFloat();
        System.out.println("Enter the height of the cone: ");
        float height = input.nextFloat();
        double volume = (Math.PI * Math.pow(radius, 2) *height);
        System.out.println(volume);
    }

    private static void volmOfPrism(Scanner input) {
        System.out.println("Enter the height ");
        float height = input.nextFloat();
        System.out.println("Enter the base ");
        float base = input.nextFloat();
        System.out.println("Volume = " + (base * height));

    }

    private static void volmOfCone(Scanner input) {
        System.out.println("Enter the radius of the cone: ");
        float radius = input.nextFloat();
        System.out.println("Enter the height of the cone: ");
        float height = input.nextFloat();
        double volume = (Math.PI * Math.pow(radius, 2) *height)/3;
        System.out.println(volume);
    }
}
