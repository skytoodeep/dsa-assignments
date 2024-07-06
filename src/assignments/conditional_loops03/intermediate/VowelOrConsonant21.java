package assignments.conditional_loops03.intermediate;

import java.util.Locale;
import java.util.Scanner;

public class VowelOrConsonant21 {
    public static void main(String[] args) {
        System.out.println("Enter a character : ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().toLowerCase(Locale.ROOT).charAt(0);
        if(Character.isLetter(ch))
        {
            switch(ch) {
                case 'a' -> System.out.println("Letter is a vowel");
                case 'e' -> System.out.println("Letter is a vowel");
                case 'i' -> System.out.println("Letter is a vowel");
                case 'o' -> System.out.println("Letter is a vowel");
                case 'u' -> System.out.println("Letter is a vowel");
                default -> System.out.println("Letter is consonant");
            }
        }
    }
}
