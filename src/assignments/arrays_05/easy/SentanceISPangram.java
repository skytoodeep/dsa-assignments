package assignments.arrays_05.easy;
//10. [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
public class SentanceISPangram {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(checkIfPangram2(str));
    }
    private static boolean checkIfPangram2(String str) {
        for(char i='a';i<='z';i++){
            if(str.indexOf(i)<0){
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfPangram(String str) {
        char roman;
        boolean[] booleans = new boolean[123];
        int local =0;
        for(int i=0;i<str.length();i++){
            roman = str.charAt(i);
            if(roman>='a' && roman<='z'){
                 booleans[roman]=true;
            }
        }
        local = 'a';
        while (local<='z'){
            if(!booleans[local])
                return false;
            else{
                local++;
            }
        }
        return true;
    }
}
