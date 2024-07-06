package assignments.conditional_loops03.basics;
//22. [Subtract the Product and Sum of Digits of an Integer](
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)

public class Product_Sum {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(705));

    }
    public static int subtractProductAndSum(int n) {
        int product =1;
        int add = 0;

        if(n>0){

            while(n>0){
                int temp = n%10;
                product*=temp;
                add+=temp;
                n/=10;
            }
            return product-add;
        }
        else{
            System.out.println("Nummmber Invalid!!");
            return -1;
        }
    }
}
