package com.String;

public class MinOperations {
    public int minOperations(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            // Check if the character at even position should be '0'
            if ((i % 2 == 0 && s.charAt(i) != '0') || (i % 2 == 1 && s.charAt(i) != '1')) {
                count++;
            }
        }

        return Math.min(count, s.length() - count);
    }
}
