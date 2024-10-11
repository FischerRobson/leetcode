package org.example;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n * (n + 1)) / 2;

        int sum = Arrays.stream(nums).sum();

        return totalSum - sum;
    }
}
