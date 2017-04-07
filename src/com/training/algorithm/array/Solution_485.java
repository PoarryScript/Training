package com.training.algorithm.array;

/**
 * Created by j-yangbo on 2017/4/7.
 * MaxConsecutiveOnes
 */
public class Solution_485 {
    public static void main(String[] args) {
        Solution_485 solution = new Solution_485();

        int[] newTest = {0, 1, 1, 1, 1, 1, 0, 1, 0};
        System.out.println("" + solution.findMaxConsecutiveOnes(newTest));

    }

    private int findMaxConsecutiveOnes(int[] nums) {
        int curCount = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                maxCount = Math.max(maxCount, curCount);
                curCount = 0;
            } else {
                curCount++;
                maxCount = Math.max(maxCount, curCount);
            }

        }
        return maxCount;
    }

}
