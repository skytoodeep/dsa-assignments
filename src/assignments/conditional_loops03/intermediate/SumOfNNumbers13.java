package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

public class SumOfNNumbers13 {
//    13. Sum Of N Numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int sum = 0;
        while(true){
            String str = input.nextLine();
            if(str.isEmpty()){
                System.out.println(sum);
                break;
            }
            else{
                sum+=Integer.parseInt(str);
            }
        }
    }
}
