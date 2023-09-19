package com.Arr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) throws Exception {
        String line;

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        try {
            int n = Integer.parseInt(br.readLine()); // Read the number of elements
            String[] inputNumbers = br.readLine().split(" ");
            int max = -999999;
            int min = 999999;
            for(int i=0;i<inputNumbers.length;i++) {
                max = Math.max(Integer.parseInt(inputNumbers[i]), max);
                min = Math.min(Integer.parseInt(inputNumbers[i]), min);
            }
            System.out.println(max - min);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
