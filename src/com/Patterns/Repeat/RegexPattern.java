package com.Patterns.Repeat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
    public static void main(String[] args) {
        String regex = "[a-zA-Z]";
        String input = "abcABChewiuryewiojdlcdhkjd,jsaoidjasio";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
