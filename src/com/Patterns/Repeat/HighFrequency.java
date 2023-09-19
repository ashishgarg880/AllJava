package com.Patterns.Repeat;

import java.util.HashMap;
import java.util.Map;

public class HighFrequency {
    public static String solve(int N, String S) {
        if (S == null || S.isEmpty()) {
            return "";
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int minStart = 0;
        int currentStart = 0;

        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0) + 1);

            if (frequencyMap.get(currentChar) > maxFrequency) {
                maxFrequency = frequencyMap.get(currentChar);
                minStart = currentStart;
            } else if (frequencyMap.get(currentChar) == maxFrequency) {
                // Check if the current character is lexicographically smaller
                if (currentChar < S.charAt(minStart)) {
                    minStart = i;
                }
            }

            // Move the currentStart to the next character
            currentStart++;
        }

        return S.substring(minStart, minStart + 1);
    }
}
