package assignments.flow_of_program_01;

import java.util.Scanner;

public class LeapYear {

    //assignment 01 : Input a year and find whether it is a leap year or not.
//    Intermediate : 23. Check Leap Year Or Not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ennter the year : ");
        int year = sc.nextInt();
        if(year!=0){
            if(year%4==0){
                System.out.println("The year is a leap year");
            }
            else{
                System.out.println("The year is not a leap year");
            }
        }
        else {
            System.out.println("Enter a valid year : ");
        }
    }
}
