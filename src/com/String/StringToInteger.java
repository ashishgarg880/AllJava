package com.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInteger {
    public int myAtoi(String s) {
        Pattern pattern = Pattern.compile("^\\s*([+-]?\\d+)");

        // Use the pattern to create a Matcher object
        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            try {
                // Extract the matched substring and convert it to an integer
                String match = matcher.group(1);
                int result = Integer.parseInt(match);

                // Clamp the result within the 32-bit integer range
                if (result < -2147483648) {
                    return -2147483648;
                } else if (result > 2147483647) {
                    return 2147483647;
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                // Handle the case where the matched substring cannot be converted to an integer
                if (s.charAt(0) == '-') {
                    return -2147483648;
                } else {
                    return 2147483647;
                }
            }
        } else {
            // No valid integer found in the string, return 0
            return 0;
        }
    }
}

