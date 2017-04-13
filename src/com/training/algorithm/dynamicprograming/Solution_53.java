package com.training.algorithm.dynamicprograming;

/**
 * Created by j-yangbo on 2017/4/13.
 * <p>
 * 53. Maximum Subarray
 * DescriptionSubmissionsSolutions
 * Total Accepted: 183162
 * Total Submissions: 467575
 * Difficulty: Easy
 * Contributor: LeetCode
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * <p>
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
public class Solution_53 {
    public static void main(String[] args) {
        Solution_53 solution = new Solution_53();


        int[] testArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("" + solution.maxSubArray(testArray));
    }

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int sum = Integer.MIN_VALUE;
        int currentMax=0;
        for (int i = 0; i < nums.length; i++) {
            currentMax+=nums[i];
            sum = Math.max(sum, currentMax);
            if (currentMax<0){
                currentMax =0;
            }
        }
        return sum;
    }


}
