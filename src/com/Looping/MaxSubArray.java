package com.Looping;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty");
        }

        // Initialize variables to track the maximum sum
        int currentMax = nums[0];
        int globalMax = nums[0];

        // Iterate over the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update the current max either by adding the current element or starting fresh from it
            currentMax = Math.max(nums[i], currentMax + nums[i]);

            // Update the global max if needed
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }
}
