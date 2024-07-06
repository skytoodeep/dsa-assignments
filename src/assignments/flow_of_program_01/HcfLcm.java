package assignments.flow_of_program_01;

import java.util.Scanner;

public class HcfLcm {
    //4. Take 2 numbers as inputs and find their HCF and LCM.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Lcm of the numbers is : "+lcm(num1,num2));
        System.out.println("Hcf of the numbers is : "+hcf(num1,num2));
    }

    static int hcf(int num1, int num2){
        int min = Math.min(num1,num2);
        int hcf;
        for(int i=2;i< min;i++){
            if(num1%i==0 && num2%i ==0){
                hcf = i;
                return hcf;
            }
        }
        return 1;
    }

    static int lcm(int num1, int num2){
        int max = Math.max(num1,num2);

        while(true){
            if(max%num1==0 && max%num2==0){
                return max;
            }
            else {
                max++;
            }
        }

        /*if(num1 >1 && num2 >1){
            for(int i=2;(i<=num1 || i<=num2);i++){
                if(num1%i==0 && num2%i==0){
                    num1=num1/i;
                    num2=num2/i;
                    lcm=lcm*i;
                }
                else if (num1%i==0){
                    num1=num1/i;
                    lcm=lcm*i;
                }
                else if(num2%i==0){
                    num2=num2/i;
                    lcm=lcm*i;
                }

            }
        }*/
//        return lcm;
    }
}
