package com.Arr;

public class FabonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int[] memo = new int[n + 1];
        System.out.println("Fibonacci of " + n + ": " + fibonacci(n, memo));
    }

    public static int fibonacci(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n]; // Return stored result
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

//    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n; // Base cases
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
//    }

//    public static int fibonacci(int n, int[] memo) {
//        if (n <= 1) {
//            return n;
//        }
//        if (memo[n] != 0) {
//            return memo[n]; // Use stored result
//        }
//        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo); // Store result
//        return memo[n];
//    }
}
