package assignments.functions_04;
//13. [Write a function that returns all prime numbers between two given numbers.]
// (https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/)

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int start = input.nextInt();
        int end = input.nextInt();
        primeNumbersFromRange(start,end);
    }

    private static void primeNumbersFromRange(int start, int end) {

        int startSqrt ;
        boolean flag= true;

        for(int i=start; i<=end; i++,start++){
            startSqrt = (int) Math.sqrt(start);
            for(int j=2;j<=startSqrt;j++){
                if(start%j==0){
                    flag = false;
                    break;
                }
                else{
                    flag = true;
                    continue;
                }
            }

            if(flag){
                System.out.print(start +" ");
            }
        }


        /*int[] arr = new int[end-start];
        int j=0;
        while(start <= end){
            startSqrt = (int) Math.sqrt(start);
            for(int i=2;i<startSqrt;i++){
                if(startSqrt%i==0){
                    break;
                }
            }
            arr[j] = start;
            start++;
            j++;
        }
        System.out.println(Arrays.toString(arr));*/
    }
}
