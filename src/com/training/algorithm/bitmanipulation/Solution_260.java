package com.training.algorithm.bitmanipulation;

import com.training.algorithm.Utils;

/**
 * Created by j-yangbo on 2017/4/27.
 * <p>
 * <p>
 * <p>
 * 260. Single Number III
 * <p>
 * <p>
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.
 * <p>
 * For example:
 * <p>
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * <p>
 * Note:
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
public class Solution_260 {
    //todo

    public int[] singleNumber(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            c ^= nums[i];
        }

        System.out.println("" + c);
        return new int[0];
    }


    public static void main(String[] args) {

        int[] test = {1, 2, 1, 3, 2, 5};

        Solution_260 solution_260 = new Solution_260();
        int[] result = solution_260.singleNumber(test);
        Utils.printArray(result);
    }
}
