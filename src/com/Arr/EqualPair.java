package com.Arr;

import java.util.Arrays;

public class EqualPair {
    public static void main(String[] args) {
        EqualPair equalPair = new EqualPair();
        int[][] grid = new int[][]{{5,3}, {4,6}, {15,3}, {4,4}};
        System.out.println(equalPair.equals(grid));
    }
    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] row = grid[i];

            for (int j = 0; j < n; j++) {
                int[] col = new int[n];

                for (int k = 0; k < n; k++) {
                    col[k] = grid[k][j];
                }

                if (Arrays.equals(row, col)) {
                    count++;
                }
            }
        }

        return count;
    }
}
