package com.DP;

import java.util.Arrays;

public class Candies {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1); // Initialize all children with 1 candy

        // Left to right pass
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                System.out.println("Left to Right " + ratings[i] + " " + ratings[i - 1]);
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right to left pass
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                System.out.println("Right to Left " + ratings[i] + " " + ratings[i + 1]);
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Sum up the total candies
        int totalCandies = Arrays.stream(candies).sum();

        return totalCandies;
    }
}
