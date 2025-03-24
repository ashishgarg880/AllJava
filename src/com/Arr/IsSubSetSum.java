package com.Arr;

public class IsSubSetSum {

    // Recursive function to check if subset sum is possible
    public static boolean isSubsetSum(int[] nums, int n, int target) {
        // Base cases
        if (target == 0) {
            return true; // Found a subset
        }
        if (n == 0) {
            return false; // No more elements to check
        }

        // If the current number is greater than the target, exclude it
        if (nums[n - 1] > target) {
            return isSubsetSum(nums, n - 1, target);
        }

        // Recursive case: include or exclude the current number
        return isSubsetSum(nums, n - 1, target) || // Exclude current element
                isSubsetSum(nums, n - 1, target - nums[n - 1]); // Include current element
    }

    public static int countSubsetSum(int[] nums, int target) {
        int n = nums.length;
        int[][] dp = new int[n + 1][target + 1];

        // Base case: There's 1 way to make sum 0 (empty subset)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                // Exclude the current number
                dp[i][j] = dp[i - 1][j];

                // Include the current number if it doesn't exceed the current sum
                if (nums[i - 1] <= j) {
                    dp[i][j] += dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        return dp[n][target];
    }


    public static int countSubsetSum(int[] nums, float target) {
        int[] dp = new int[(int)target + 1];
        dp[0] = 1; // Base case: One way to make sum 0 (empty subset)

        for (int num : nums) {
            for (float j = target; j >= num; j--) {
                dp[(int)j] += dp[(int)j - num];
            }
        }

        return dp[(int)target];
    }
}
