package com.training.algorithm.array;

import com.training.algorithm.Utils;

/**
 * Created by j-yangbo on 2017/5/3.
 * 238. Product of Array Except Self
 * <p>
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * <p>
 * Solve it without division and in O(n).
 * <p>
 * For example, given [1,2,3,4], return [24,12,8,6].
 * <p>
 * Follow up:
 * Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class Solution_238 {

    public static void main(String[] args) {

        Solution_238 solution_238 = new Solution_238();
        int[] testCase = {1,2,3,4};
       Utils.printArray( solution_238.productExceptSelf(testCase));
    }

    public int[] productExceptSelf(int[] nums) {
            if (nums == null) {
                return new int[0];
            }
            int length  = nums.length;
            int[] lefttoRightArray = new int[length];
            int[] righttoLeftArray = new int[length];
            righttoLeftArray[length-1]=1;
            lefttoRightArray[0] = 1;

            for (int i = 0; i < length-1; i++) {
                lefttoRightArray[i+1] = nums[i] *lefttoRightArray[i];
            }
            for (int i = nums.length-1; i >0 ; i--) {
                righttoLeftArray[i-1] = nums[i]*righttoLeftArray[i];
            }
            int[] productArray = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                productArray[i] = lefttoRightArray[i]*righttoLeftArray[i];
            }

            return productArray;
    }
}
