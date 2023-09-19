package com.PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        System.out.println(Arrays.toString(nums));
        for (int num : nums) {
            minHeap.offer(num);
            System.out.println(minHeap);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
