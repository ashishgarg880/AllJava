package com.Looping;

public class FirstMissingPositive {
    public float twin(int a, float b) {
        return 3;
    }
    public float twin(float a, float b) {
        return 3;
    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // First pass: place each number in its right position
        for (int i = 0; i < n; i++) {
            // While the number is in the range and not in its right position
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Second pass: find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1; // Return the first missing positive integer
            }
        }

        // If all positions are filled correctly, return n + 1
        return n + 1;
    }
}
