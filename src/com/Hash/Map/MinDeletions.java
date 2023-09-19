package com.Hash.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinDeletions {
    public int minDeletions(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character in the string.
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int deletion = 0;
        Set<Integer> frequencyCount = new HashSet<>();

        // Iterate through the frequency map and keep track of frequencies' count.
        for (int freq : frequencyMap.values()) {
            while(freq > 0 && frequencyCount.contains(freq)) {
                freq--;
                deletion++;
            }
            frequencyCount.add(freq);
        }

        return deletion;
    }
}
