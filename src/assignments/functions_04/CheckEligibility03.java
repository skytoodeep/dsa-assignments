package assignments.functions_04;
//3. [A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.](https://www.efaculty.in/java-programs/voting-age-program-in-java/)

import java.util.Scanner;

public class CheckEligibility03 {
    public static void main(String[] args) {
        System.out.println("Enter the age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean eligible = age >= 18;
        System.out.println("Eligible "+eligible);
    }
}
