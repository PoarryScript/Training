package com.training.algorithm.bitmanipulation;

/**
 * Created by j-yangbo on 2017/4/27.
 * <p>
 * 137. Single Number II
 * <p>
 * <p>
 * Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class Solution_137 {
    public static void main(String[] args) {
        int[] test = {23, 4, 5, 6, 12, 5, 6, 3, 12, 4, 23, 4, 5, 6, 12, 23};

        Solution_137 solution_137 = new Solution_137();
        System.out.println("" + solution_137.singleNumber(test));

    }

    public int singleNumber(int[] nums) {
        int b1 = 0,result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = (result^nums[i])&(~b1);
            b1 = (b1^nums[i])&(~result);

        }
        return result;

    }
}
