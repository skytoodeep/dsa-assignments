package assignments.functions_04;

import java.util.Scanner;

/*8. [Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:](https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) <br/>
<pre>
        Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
        </pre>*/
public class CalculateGrades08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number subjects ");

        double percentage = calculatePercentage(sc);
        System.out.println(showGrades(percentage));;
    }

    private static double calculatePercentage(Scanner sc) {
        double percentage =0.0;
        int marks =0;
        int subjects = sc.nextInt();
        for(int i=0; i < subjects; i++){
            System.out.println("Enter the marks of subject "+ (i+1));
            marks += sc.nextInt();
        }
        System.out.println(marks);
        percentage = ((double) (marks * 100) /(subjects*100));
        return percentage;
    }

    private static String showGrades(double percentage) {
        if(percentage>90){
            return "AA";
        }
        else if(percentage>80){
            return "AB";
        }
        else if(percentage>70){
            return "BB";
        }
        else if(percentage>60){
            return "BC";
        }
        else if(percentage>50){
            return "CD";
        }
        else if(percentage>40){
            return "DD";
        }
        else{
            return "Fail";
        }
    }
}
