package com.TreeNde;

import java.util.TreeMap;

public class ContinousSubArray {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length;
        int start = 0;
        TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();
        long totalSubarrays = 0;

        for (int end = 0; end < n; end++) {
            // Add current element to the frequency map
            frequencyMap.put(nums[end], frequencyMap.getOrDefault(nums[end], 0) + 1);

            // Shrink the window if the condition is violated
            while (frequencyMap.lastKey() - frequencyMap.firstKey() > 2) {
                int freq = frequencyMap.get(nums[start]);
                if (freq == 1) {
                    frequencyMap.remove(nums[start]);
                } else {
                    frequencyMap.put(nums[start], freq - 1);
                }
                start++;
            }

            // Add the count of subarrays ending at 'end'
            totalSubarrays += (end - start + 1);
        }

        return totalSubarrays;
    }
}
