package com.DP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DynamicProgram {
    public static void main(String[] args) {
//        Coins coins  = new Coins();
//        int[] arr = {1,2, 5 ,10, 20, 50,7};
//        List<Integer> result = Coins.change(40, arr);
//        System.out.println("Coins" + result);
//        System.out.println(coins.SolveString("Welcome to Logilite"));
//
//        String str = "This this is is done by me done by me";
//        System.out.println(coins.countNumber(str));
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int N = sc.nextInt(); // Total number of chocolates

            // Initialize the number of chocolates in each jar
            int jar1, jar2, jar3;

            // Distribute the chocolates as per the conditions
            if (N % 2 == 0) {
                // If N is even
                jar1 = N / 2;
                jar2 = 1;
                jar3 = N / 2;
            } else {
                // If N is odd
                jar1 = N / 2;
                jar2 = 2;
                jar3 = N / 2 - 1;
            }

            // Print the distribution
            System.out.println(jar1 + " " + jar2 + " " + jar3);
        }
    }
}
