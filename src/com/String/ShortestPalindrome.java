package com.String;

public class ShortestPalindrome {
    public String shortestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        String reversedS = new StringBuilder(s).reverse().toString();
        String combinedString = s + "#" + reversedS;

        // Compute KMP table
        int[] kmpTable = computeKMPTable(combinedString);

        // Length of the palindrome part
        int palindromeLength = kmpTable[kmpTable.length - 1];

        // Add the non-palindromic part (suffix) in reverse order to the front
        String nonPalindromePart = s.substring(palindromeLength);
        String result = new StringBuilder(nonPalindromePart).reverse().toString() + s;

        return result;
    }

    private int[] computeKMPTable(String s) {
        int[] kmpTable = new int[s.length()];
        int j = 0; // Length of the previous longest prefix suffix

        for (int i = 1; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = kmpTable[j - 1]; // Fallback to the previous matching prefix
            }

            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }

            kmpTable[i] = j;
        }

        return kmpTable;
    }
}
