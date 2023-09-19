package com.lambda;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LargestSumSubArray {
    public static long maxSumWithK(long arr[], long o, long k)
    {
        int n = arr.length;

        // Calculate the prefix sum of the array
        int[] prefixSum = new int[n];
        prefixSum[0] = (int)arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + (int) arr[i];
        }
        return 0000L;

        // Calculate the sum of subarrays with at least k elements
//        return Arrays.stream(prefixSum)
//                .mapToObj((sum, index) -> Arrays.stream(prefixSum, index, n)
//                        .map(subSum -> subSum - sum)
//                        .filter(subSum -> subSum >= 0)
//                        .max()
//                        .orElse(Integer.MIN_VALUE))
//                .mapToInt(Integer::intValue)
//                .max()
//                .orElse(Integer.MIN_VALUE);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        try {
            while (t-- > 0) {
                long n = Long.parseLong(br.readLine().trim());
                long[] arr = new long[(int) n];
                String[] inputReader = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    arr[i] = Long.parseLong(br.readLine());
                }
                long k = Long.parseLong(br.readLine().trim());
                System.out.println(maxSumWithK(arr, n, k));
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }

}

