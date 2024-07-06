package assignments.flow_of_program_01;

import java.util.Scanner;

public class LoopingInputs {
    //5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
    public static void main(String[] args) {
        System.out.println("Enter the input numbers to add : ");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input;
        while(true){
            String str = sc.next();
            if(str.equals("x")){
                System.out.println("Total of the numbers :"+sum);
                break;
            }
            else{
               sum += Integer.parseInt(str);
            }

        }
    }
}
