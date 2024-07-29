package assignments.arrays_05.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//18. [Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)
public class ArrayFormofInteger18 {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        /*int[] num = {1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3};
        int k = 516;*/
        /*int[] num={0};
        int k = 23;*/
        /*int[] num={6};
        int k = 809;*/
        System.out.println(addToArrayForm2(num, k));
    }

    private static List<Integer> addToArrayForm2(int[] num, int k) {
        List<Integer> numbers = new ArrayList<>();
        int local;
        int hold=0;
        for(int i=num.length-1;i>=0;i--){
            local=num[i];
            if(hold==0 && k==0){
                numbers.add(local);
                continue;
            }
            int temp = k%10;
            k/=10;
            hold=hold+local+temp;
            if(hold>=10){
                numbers.add(hold%10);
            }else {
                numbers.add(hold);
            }
            hold=hold/10;
        }
        local=hold+k;
        while(local>0){
            numbers.add(local%10);
            local/=10;
        }
        numbers=numbers.reversed();
        return numbers;
    }


    private static List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length;
        List<Integer> aList = new ArrayList<>();
        if (len > 14) {
            long total = 0;
            for (int i = 0; i < len - 6; i++) {
                aList.add(num[i]);
            }
            for (int i = len - 6; i < len; i++) {
                total = (total * 10) + num[i];
            }
            total += k;
            Long kul = total;
            String str = kul.toString();
            for (int i = 0; i < str.length(); i++) {
                aList.add(str.charAt(i) - 48);
            }
            return aList;
        } else {
            long total = 0;
            for (int i = 0; i < len; i++) {
                total = total * 10 + num[i];
            }
            total += k;
            Long kul = total;
            String str = kul.toString();
            for (int i = 0; i < str.length(); i++) {
                aList.add(str.charAt(i) - 48);
            }
        }
        return aList;
    }


    private static List<BigInteger> addToArrayFormBig(int[] num, int k) {
        List<BigInteger> aList = new ArrayList<>();
        String str = Arrays.toString(num);
        int len = str.length() - 1;
        BigInteger total = new BigInteger(Integer.valueOf(0).toString());
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                int temp = str.charAt(i) - 48;
                total = (total.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(temp)));
            }
        }
        total = total.add(BigInteger.valueOf(k));
        str = total.toString();
        for (int i = 0; i < str.length(); i++) {
            aList.add(BigInteger.valueOf((int) str.charAt(i) - 48));
        }
        return aList;
    }

    private static List<Integer> addToArrayFormInt(int[] num, int k) {
        List<Integer> aList = new ArrayList<>();
        String str = Arrays.toString(num);
        int len = str.length() - 1;
        int total = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                int temp = str.charAt(i) - 48;
                total = (total * 10) + temp;
            }
        }
        total = total + k;
        str = Integer.toString(total);
        for (int i = 0; i < str.length(); i++) {
            aList.add((int) str.charAt(i) - 48);
        }
        return aList;
    }
}
