package com.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Coins {

    public static List<Integer> change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        // Create an array to store the selected coins for each amount
        List<List<Integer>> selectedCoins = new ArrayList<>();
        for (int i = 0; i <= amount; i++) {
            selectedCoins.add(new ArrayList<>());
        }

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE && dp[i - coin] + 1 < dp[i]) {
                    dp[i] = dp[i - coin] + 1;
                    // Update the selected coins list for this amount
                    List<Integer> coinsUsed = new ArrayList<>(selectedCoins.get(i - coin));
                    coinsUsed.add(coin);
                    selectedCoins.set(i, coinsUsed);
                }
            }
        }

        return selectedCoins.get(amount);
    }

    // Function to find all combinations
    public static void findCombinationss(int[] coins, int target, List<Integer> combination, int start) {
        // Base case: If the target is 0, print the current combination
        if (target == 0) {
            System.out.println(combination);
            return;
        }

        // Loop through the coins array starting from the current index
        for (int i = start; i < coins.length; i++) {
            if (coins[i] <= target) { // Choose the coin if it does not exceed the target
                combination.add(coins[i]); // Add coin to current combination
                findCombinationss(coins, target - coins[i], combination, i); // Allow reuse of the same coin
                combination.remove(combination.size() - 1); // Backtrack to try the next option
            }
        }
    }

    public String SolveString(String str ) {
        String[] s = str.split(" ");
        String ans = "";
        for(String st : s) {
            for(int i=st.length()-1;i>=0;i--) {
                ans +=  Character.isUpperCase(st.charAt(i)) ? Character.toLowerCase(st.charAt(i)) :  Character.toUpperCase(st.charAt(i)) ;
            }
            ans+=" ";
        }

        return ans;
    }

    public HashMap<String,Integer> countNumber (String str) {
        HashMap<String, Integer> map = new
                HashMap<String, Integer>();
        String[] st = str.split(" ");
        for (String s : st) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }

    public static int countWays(int[] coins, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1; // Base case: One way to make sum 0 (no coins)

        for (int coin : coins) {
            for (int j = coin; j <= target; j++) {
                dp[j] += dp[j - coin];
            }
        }

        return dp[target];
    }

    public static int minCoins(int[] coins, int target) {
        int[] dp = new int[target + 1];
        int max = target + 1;
        for (int i = 1; i <= target; i++) {
            dp[i] = max; // Initialize with a large value
        }

        dp[0] = 0; // Base case: 0 coins to make sum 0

        for (int coin : coins) {
            for (int j = coin; j <= target; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin] + 1);
            }
        }

        return dp[target] == max ? -1 : dp[target]; // Return -1 if no solution
    }

    // Function to find all combinations with limited coins
    public static void findCombinations(int[] coins, int[] counts, int target, List<Integer> combination, int start) {
        // Base case: If the target is 0, print the current combination
        if (target == 0) {
            System.out.println(combination);
            return;
        }

        // Loop through the coins array starting from the current index
        for (int i = start; i < coins.length; i++) {
            if (coins[i] <= target && counts[i] > 0) { // Check if the coin can be used
                combination.add(coins[i]); // Add the coin to the current combination
                counts[i]--; // Decrease the available count of this coin
                findCombinations(coins, counts, target - coins[i], combination, i); // Recur with reduced target
                counts[i]++; // Backtrack: Restore the count of this coin
                combination.remove(combination.size() - 1); // Remove the coin from the combination
            }
        }
    }

    public static void findCombinations(int[] coins, int target, List<Integer> combination, int start) {
        if (target == 0) {
            System.out.println(combination); // Print valid combination
            return;
        }

        for (int i = start; i < coins.length; i++) {
            if (coins[i] <= target) {
                combination.add(coins[i]); // Choose the coin
                findCombinations(coins, target - coins[i], combination, i); // Allow reuse of the same coin
                combination.remove(combination.size() - 1); // Backtrack
            }
        }
    }

    public static boolean canMakeChange(int[] coins, int target) {
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // Base case: Can always make sum 0

        for (int coin : coins) {
            for (int j = coin; j <= target; j++) {
                dp[j] = dp[j] || dp[j - coin];
            }
        }

        return dp[target];
    }
}
