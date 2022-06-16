package com.String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int textCases = sc.nextInt();
        String ptr = "<([^>]+)>([^<>]+)</\\1>";
        Pattern p = Pattern.compile(ptr);
        String str;
        while (textCases > 0) {
            str = sc.nextLine();

            Matcher m = p.matcher(str);
            boolean findMath = true;
            while (m.find()){
                System.out.println(m.group(2));
                findMath = false;
            }
            if(findMath){
                System.out.println("NONE");
            }
            textCases--;
        }
    }
}
