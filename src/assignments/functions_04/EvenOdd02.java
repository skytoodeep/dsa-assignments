package assignments.functions_04;
//2. [Define a program to find out whether a given number is even or odd.](https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/)

public class EvenOdd02 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(System.console().readLine());
        System.out.println("Number is even "+ evenOdd(number));
    }
    public static boolean evenOdd(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
