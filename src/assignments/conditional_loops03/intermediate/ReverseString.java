package assignments.conditional_loops03.intermediate;

import java.util.Scanner;

public class ReverseString {
    //roman
    //namor
//    16. Reverse A String In Java
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();
        int first = 0;
        int last = ch.length - 1;
        for(char c : ch){
            if(first<last) {
                ch[first] = ch[last];
                ch[last] = c;
                first++;
                last--;
            }
            else{
                break;
            }
        }
        System.out.println("Reversed "+ String.valueOf(ch));
    }
}

