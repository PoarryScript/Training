package com.training.algorithm.array;

import com.training.algorithm.Utils;

/**
 * Created by j-yangbo on 2017/4/14.
 * <p>
 * 283. Move Zeroes
 * <p>
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * <p>
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * Credits:
 * Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 */
public class Solution_283 {

    public static void main(String[] args) {
        Solution_283 solution = new Solution_283();
//        int[] test = {0, 1, 0, 3, 12};
//        int[] test = {0, 0, 0, 0, 12};
//        int[] test = {10, 0, 0, 0, 0};
        int[] test = {10, 0, 0, 110, 0};
        solution.moveZeroes(test);
    }

/*
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                //detection zero
                if (nums[i] == 0 && nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }

        Utils.printArray(nums);
    }*/

public void moveZeroes(int[] nums){
    int detectionZeroIndex=0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i]!=0){
            int swap = nums[i];
            nums[i]= nums[detectionZeroIndex];
            nums[detectionZeroIndex] =swap;
            detectionZeroIndex++;
        }
    }
    Utils.printArray(nums);

}


}
