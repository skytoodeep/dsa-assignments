package assignments.arrays_05.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//11. [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/)
public class ItemsMatchingARule11 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> subItem1 = new ArrayList<>(List.of("phone","blue","pixel"));
        List<String> subItem2 = new LinkedList<>(List.of("computer","silver","phone"));
        List<String> subItem3 = new ArrayList<>(List.of("phone","gold","iphone"));
        items.add(subItem1);
        items.add(subItem2);
        items.add(subItem3);
        String ruleKey = "type";
        String ruleValue = "phone";
        
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }

    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        switch (ruleKey){
            case "type"->{
                for (List<String> str : items){
                    if(str.get(0).equals(ruleValue)){
                        count++;
                    }
                }
            }
            case "color"->{
                for (List<String> str : items){
                    if(str.get(1).equals(ruleValue)){
                        count++;
                    }
                }
            }
            case "name"->{
                for (List<String> str : items){
                    if(str.get(2).equals(ruleValue)){
                        count++;
                    }
                }
            }
            default -> {
                System.out.println("Invalid Rulekey");
                break;
            }
        }
        return count;
    }
}
