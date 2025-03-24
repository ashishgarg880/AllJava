package com.Arr;

public class LexicographicallySmallestArray {

    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int i=0;
        while(i < nums.length && limit != 0) {
            int j= i+2, k=j-1;
            if(j <= nums.length - 1) {
                if(nums[i] < nums[k] && nums[k] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[k];
                    nums[k] = temp;
                    limit--;
                }
            }
            i++;
        }

        return nums;
    }

}
