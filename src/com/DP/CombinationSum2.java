package com.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        backtrack(results, new ArrayList<>(), candidates, target, 0);
        return results;
    }

    private void backtrack(List<List<Integer>> results, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return; // Exceeded target sum
        if (remain == 0) {
            results.add(new ArrayList<>(tempList)); // Found a valid combination
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            tempList.add(candidates[i]);
            // Recursive call with updated parameters
            backtrack(results, tempList, candidates, remain - candidates[i], i + 1); // Move to the next index
            tempList.remove(tempList.size() - 1); // Backtrack
        }
    }
}
