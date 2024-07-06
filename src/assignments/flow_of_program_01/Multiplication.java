package assignments.flow_of_program_01;

import java.util.Scanner;

public class Multiplication {
    //3. Take a number as input and print the multiplication table for it.
    public static void main(String[] args) {
        System.out.println("Enter the number to multiply");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for(int i=1; i<=10;i++){
            int multi = number*i;
            System.out.println(number+"*"+i+"= "+multi);
        }
    }
}
