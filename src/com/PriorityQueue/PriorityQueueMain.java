package com.PriorityQueue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        FindKthLargest findKthLargest = new FindKthLargest();
        int[]  nums = {3, 2, 1, 5, 6, 4};
        int result =  findKthLargest.findKthLargest(nums,2);
        System.out.println(result);
    }
}
