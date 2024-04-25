package com.Patterns.Repeat;

public class MaxProfitTwice {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) {
            return 0; // If there are no days or only one day, profit is zero
        }

        int[] maxProfitOne = new int[n]; // Array to store max profit after one transaction
        int[] maxProfitTwo = new int[n]; // Array to store max profit after two transactions

        int minPrice = prices[0]; // Initialize min price
        maxProfitOne[0] = 0;
        maxProfitTwo[0] = 0;

        // Calculate max profit after one transaction
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfitOne[i] = Math.max(maxProfitOne[i - 1], prices[i] - minPrice);
        }

        int maxPrice = prices[n - 1]; // Initialize max price
        maxProfitTwo[n - 1] = 0;

        // Calculate max profit after two transactions
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            maxProfitTwo[i] = Math.max(maxProfitTwo[i + 1], maxPrice - prices[i]);
        }

        int maxProfit = 0;

        // Find the maximum total profit by combining profits from one and two transactions
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, maxProfitOne[i] + (i + 1 < n ? maxProfitTwo[i + 1] : 0));
        }

        return maxProfit;
    }
}
