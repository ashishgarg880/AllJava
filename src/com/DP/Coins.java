package com.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Coins {

    public static List<Integer> change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        // Create an array to store the selected coins for each amount
        List<List<Integer>> selectedCoins = new ArrayList<>();
        for (int i = 0; i <= amount; i++) {
            selectedCoins.add(new ArrayList<>());
        }

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE && dp[i - coin] + 1 < dp[i]) {
                    dp[i] = dp[i - coin] + 1;
                    // Update the selected coins list for this amount
                    List<Integer> coinsUsed = new ArrayList<>(selectedCoins.get(i - coin));
                    coinsUsed.add(coin);
                    selectedCoins.set(i, coinsUsed);
                }
            }
        }

        return selectedCoins.get(amount);
    }
    public String SolveString(String str ) {
        String[] s = str.split(" ");
        String ans = "";
        for(String st : s) {
            for(int i=st.length()-1;i>=0;i--) {
                ans +=  Character.isUpperCase(st.charAt(i)) ? Character.toLowerCase(st.charAt(i)) :  Character.toUpperCase(st.charAt(i)) ;
            }
            ans+=" ";
        }

        return ans;
    }

    public HashMap<String,Integer> countNumber (String str) {
        HashMap<String,Integer> map = new
                HashMap<String,Integer>();
        String[] st = str.split(" ");
        for(String s : st) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }


}
