package com.DP;

import java.util.ArrayList;
import java.util.List;

public class FreedomTrail {
    public int findRotateSteps(String ring, String key) {
        char[] ringChar = ring.toCharArray();
        List<Integer> [] position = new List[26];

        for(int i=0;i<ringChar.length;i++) {
            int c = ringChar[i] - 'a';
            if (position[c] == null) position[c] = new ArrayList<>();
            position[c].add(i);
        }

        int[][] dp = new int[key.length()][ringChar.length];

        return helper(0,0, position, key.toCharArray(), ringChar, dp);
    }

    // Recursive function with memoization
    int helper(int index, int pos, List<Integer>[] positions, char[] key, char[] ring, int[][] dp) {
        // If all characters of the key have been matched, return 0
        if (index == key.length) return 0;

        // If this state has already been computed, return the cached result
        if (dp[index][pos] > 0) return dp[index][pos];

        // Current character in the key
        char target = key[index];

        // List of possible positions of the current character in the ring
        List<Integer> possiblePositions = positions[target - 'a'];

        // Minimum steps required to reach the current character from the current position
        int minSteps = Integer.MAX_VALUE;

        // Iterate through possible positions and calculate minimum steps
        for (int nextPos : possiblePositions) {
            // Calculate the steps to move from the current position to the next position
            int steps = Math.min(Math.abs(nextPos - pos), ring.length - Math.abs(nextPos - pos));

            // Calculate steps for remaining characters recursively
            int totalSteps = steps + helper(index + 1, nextPos, positions, key, ring, dp);

            // Update the minimum steps
            minSteps = Math.min(minSteps, totalSteps);
        }

        // Cache the result and return
        return dp[index][pos] = minSteps + 1;
    }
}
