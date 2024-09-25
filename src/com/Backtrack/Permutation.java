package com.Backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Sort the numbers to handle duplicates
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(result, new ArrayList<>(), nums, used);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                // Skip used numbers and avoid generating duplicate permutations
                if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                    continue;
                }
                used[i] = true;
                tempList.add(nums[i]);
                backtrack(result, tempList, nums, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
