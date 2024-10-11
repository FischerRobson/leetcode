package org.example;


import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        int[] arr2 = new int[]{3,2,4};
        int[] arr3 = new int[]{3,3};

        System.out.println(Arrays.toString(twoSum(arr, 9)));
        System.out.println(Arrays.toString(twoSum(arr2, 6)));
        System.out.println(Arrays.toString(twoSum(arr3, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> setHash = new HashMap<>();

        int[] response = new int[2];

        for (int i = 0; i < nums.length; i++) {
            setHash.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int missing = target - number;
            if(missing < 0) continue;

            if(setHash.containsKey(missing)) {
                response[0] = i;
                response[1] = setHash.get(missing);
                return response;
            }
        }

        return response;
    }
}
