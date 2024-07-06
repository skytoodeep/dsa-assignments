package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

public class CalculateCGPA {
//    10. Calculate CGPA Java Program
    public static void main(String[] args) {
        System.out.println("Enter the number of subjects ");
        Scanner input = new Scanner(System.in);
        int subjects = input.nextInt();
        System.out.println("Enter the marks of the subjects");
        int marks =0;
        float cgpa = 0f;
        for(int i=0;i<subjects;i++){
            marks = input.nextInt();
            cgpa = (marks+cgpa);
        }

//        cgpa = 9.5f*cgpa;
        System.out.println(.95*(cgpa/subjects));
    }
}
