package com.String;

import java.util.ArrayList;
import java.util.List;

public class PartitionString {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> currentList, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                currentList.add(s.substring(start, end));
                backtrack(s, end, currentList, result);
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        end--; // Adjust end to be inclusive
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
