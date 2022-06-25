package com.packageDataUsed;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases  = sc.nextInt();
        while (testCases-->0){
            String str = sc.nextLine();
            try{
                Pattern.compile(str);
                System.out.println("Valid");
            }catch (Exception e){
                System.out.println("Invalid");
            }
        }
    }
}
