package assignments.conditional_loops03.intermediate;
//19. HCF Of Two Numbers Program
public class HCFOfTwoNumbersProgram19 {
//    12,16
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        int firstNumber = Integer.parseInt(System.console().readLine());
        int  secondNumber = Integer.parseInt(System.console().readLine());
//        System.out.println("HCF is "+hcf);
        int hcf = 1;
        for(int i=2;(i<firstNumber || i<secondNumber);i++) {
            if(firstNumber%i == 0 && secondNumber%i == 0){
                firstNumber/=i;
                secondNumber/=i;
                hcf*=i;
                i--;
            }
            else{
                continue;
            }
        }
        System.out.println(hcf);
    }
}
