package org.example;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int number : nums) {
            if (counter.containsKey(number)) {
                return true;
            }
            counter.put(number, 0);
        }
        return false;
    }
}
