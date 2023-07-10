package Lesson_5;

import java.util.HashMap;
import java.util.Map;

public class L5_Task_2 {
    public static void main(String[] args) {
        String s1 = "paper";
        String s2 = "title";

        System.out.println(isIsomorph(s1,s2));
    }

    private static boolean isIsomorph(String s1, String s2) {
        if (s1.length() != s2.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])){
                if (c2[i] != map.get(c1[i])){
                    return false;
                }
            } else {
                if (map.containsKey(c2[i])){
                    return false;
                }
                map.put(c1[i], c2[i]);
            }
        }
        return true;
    }
}
