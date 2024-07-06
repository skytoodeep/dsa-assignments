package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

public class PowerInJava {
//    7. Power In Java
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("Enter the power of the number ");
        int power = sc.nextInt();
        long ans ;
        ans =(long) Math.pow(number,power);
        System.out.println(ans);
    }
}
