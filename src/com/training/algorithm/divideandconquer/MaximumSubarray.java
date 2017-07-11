package com.training.algorithm.divideandconquer;

import com.training.algorithm.Utils;

/**
 * Created by yangbo on 2017/7/5.
 */
public class MaximumSubarray {


    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] test = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] test = {-2, 1};

        Utils.printInt(maximumSubarray.maxSubArray(test));

    }

    public int maxSubArray(int[] nums) {
        return maxsubArray(nums, 0, nums.length - 1);
    }

    public int maxsubArray(int[] array, int left, int right) {
        if (array == null || array.length == 0) {
            return -1;
        }
        if (array.length == 1) {
            return array[0];
        }
        if (left == right) {
            return array[left];
        }
        int lefSUm = 0;
        int rightSum = 0;
        int crossSum = 0;

        int middle = (left + right) / 2;
        lefSUm = maxsubArray(array, left, middle);
        rightSum = maxsubArray(array, middle + 1, right);
        crossSum = maxsubArrayCross(array, left, right);

        if (lefSUm >= rightSum && lefSUm >= crossSum) {
            return lefSUm;
        } else if (rightSum >= lefSUm && rightSum >= crossSum) {
            return rightSum;
        } else {
            return crossSum;
        }

    }

    private int maxsubArrayCross(int[] array, int left, int right) {
        if (array == null) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }

        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;
        int mid = left + (right - left) / 2;

        for (int i = mid; i >= left; i--) {
            sum = sum + array[i];
            if (leftSum < sum) {
                leftSum = sum;
            }
        }
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum = sum + array[i];
            if (rightSum < sum) {
                rightSum = sum;
            }
        }
        return leftSum + rightSum;
    }
}
