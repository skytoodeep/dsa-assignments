package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

public class FindNcrNpr15 {
//    15. Find Ncr & Npr
//    nPr = n!/(n-r)!
    /*Example 1: Suppose you have a deck of 52 playing cards, and you want to find the number of ways to
    choose 5 cards in a specific order from the deck (i.e., permutations of 5 cards out of 52).*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cards ");
        int n = input.nextInt();
        System.out.println("Enter the cards to be chosen from the cards ");
        int r = input.nextInt();
        long factorialN= calculateNpr( n,r);
        System.out.println(factorialN);
        calculateNcr(n,r);
    }

    private static void calculateNcr(int n, int r) {

        long factorial  =1;
        int difference = n-r;
        int factorialR =1;
        while (n>difference){
            factorial*=n;
           n--;
        }
        while (r>1){
            factorialR*=r;
            r--;
        }
        System.out.println(factorial/factorialR);
    }

    private static long calculateNpr(int n,int r) {
        long factorial=1;
        int difference = n-r;
        while (n!=difference) {
            factorial*=n;
            n--;
        }
        return factorial;
    }
}
