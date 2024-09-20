package com.String;

public class IntToRoman {
    public static String intToRoman(int num) {
        // Arrays for Roman numeral values and their corresponding symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        // StringBuilder to accumulate the result
        StringBuilder roman = new StringBuilder();

        // Loop through values and symbols
        for (int i = 0; i < values.length; i++) {
            // Append the corresponding symbols as many times as possible
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }
}
