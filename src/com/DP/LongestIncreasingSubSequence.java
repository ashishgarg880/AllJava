package com.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestIncreasingSubSequence {
    public static List<Integer> findLongestIncreasingSubsequence(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLength = 1;
        int endIndex = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                    if (dp[i] > maxLength) {
                        maxLength = dp[i];
                        endIndex = i;
                    }
                }
            }
        }

        List<Integer> longestIncreasingSubsequence = new ArrayList<>();
        longestIncreasingSubsequence.add(nums[endIndex]);

        for (int i = endIndex - 1; i >= 0; i--) {
            if (nums[i] < nums[endIndex] && dp[i] == dp[endIndex] - 1) {
                longestIncreasingSubsequence.add(nums[i]);
                endIndex = i;
            }
        }

        return longestIncreasingSubsequence.stream().sorted(Comparator.reverseOrder()).toList();
    }
}
