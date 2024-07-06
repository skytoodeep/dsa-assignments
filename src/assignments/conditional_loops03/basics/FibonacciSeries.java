package assignments.conditional_loops03.basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int first =0;   //0,          0,1,1
        int second =1;  //1,
        System.out.print(first +" "+ second+" ");
        for(int i=1;i<number-1;i++){
            int temp = first+second;
            System.out.print(temp +" ");
            first=second;
            second=temp;

        }
    }
}
