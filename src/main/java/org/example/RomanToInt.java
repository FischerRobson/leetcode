package org.example;

import java.util.HashMap;

public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("LXI"));
        System.out.println(romanToInt("LD"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        int res = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = romans.get(s.charAt(i));
            if (i < n - 1 && current < romans.get(s.charAt(i + 1))) {
                res -= current;
            } else {
                res += current;
            }
        }

        return res;
    }

}
