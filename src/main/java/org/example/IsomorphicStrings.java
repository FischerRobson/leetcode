package org.example;

import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        return checkIsomorphic(s, t) && checkIsomorphic(t, s);
    }

    public static boolean checkIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i); // e, g, g
            char ts = t.charAt(i); // a, d, d

            if(map.containsKey(cs)) {
                char mapped = map.get(cs);
                if (mapped != ts) {
                    return false;
                }
            }
            map.put(cs, ts);
        }
        return true;
    }

}
