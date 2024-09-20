package com.String;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        // Convert integers to strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort strings using custom comparator
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                // Compare concatenated results
                return (y + x).compareTo(x + y);
            }
        });

        // Handle edge case for all zeros
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Build the largest number
        StringBuilder largestNum = new StringBuilder();
        for (String num : strNums) {
            largestNum.append(num);
        }

        return largestNum.toString();
    }
}
