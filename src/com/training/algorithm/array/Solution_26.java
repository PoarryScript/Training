package com.training.algorithm.array;

import com.sun.xml.internal.bind.v2.TODO;
import com.training.algorithm.Utils;

import java.util.Arrays;

/**
 * Created by j-yangbo on 2017/4/7.
 * 26 Remove Duplicates from Sorted Array
 * <p>
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * For example,
 * Given input array nums = [1,1,2],
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 * <p>
 * Subscribe to see which companies asked this question.
 */
public class Solution_26 {
    public static void main(String[] args) {
        Solution_26 solution = new Solution_26();
//        int[] test = {1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 8, 9,};
        int[] test = {1, 1, 3,6};
        System.out.println("length" + test.length);
        System.out.println("new length :" + solution.removeDuplicates(test));
    }

    /**
     * @param nums new array's length
     * @return
     */
    public int removeDuplicates(int[] nums) {

        int endIndex = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if (nums[i] == nums[j]) {
                    int swap = nums[j];
                    nums[j] = nums[j+1];
                    nums[endIndex] = swap;
                    endIndex--;
                }
            }
        }
        Utils.printArray(nums);
        return endIndex;
    }


}
