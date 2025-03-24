package com.Arr;

import com.DP.Coins;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
//        int result = new FreqAtMostFreqElement().maxFrequency(new int[]{2, 4, 6}, 2);
//        System.out.println(result);
//
//        int[] coins = {1, 2, 3};
//        int[] counts = {3, 2, 1};
//        int target = 4;
//
//        System.out.println("All ways to make the target " + target + " using coins:");
////        new Coins().findCombinationss(coins, target, new ArrayList<>(), 0);
//        new Coins().findCombinations(coins, counts, target, new ArrayList<>(), 0);

        int[] arr = {1,7,6,18,2,1}; int limit = 3;

        System.out.println(Arrays.toString(new LexicographicallySmallestArray().lexicographicallySmallestArray(arr, limit)));
    }
}
