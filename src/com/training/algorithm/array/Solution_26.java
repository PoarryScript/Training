package com.training.algorithm.array;

import com.sun.xml.internal.bind.v2.TODO;
import com.training.algorithm.Utils;

import java.util.Arrays;

/**
 * Created by j-yangbo on 2017/4/7.
 * Remove Duplicates from Sorted Array
 */
public class Solution_26 {
    public static void main(String[] args) {
        Solution_26 solution = new Solution_26();
        int[] test = {1, 1, 2,3,4,4,5,6,7,8,8,9,};
        System.out.println("new length :" + solution.removeDuplicates(test));
    }

    /**
     * @param nums new array's length
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int newLength = nums.length;
        int duplicateIndex = 0;
        for (int i = 1; i < nums.length-1; i++) {

            int xor = nums[i - 1] ^ nums[i];
            if (xor == 0) {
                nums[i] = nums[i + 1];
                newLength--;
            }
        }
        Utils.printArray(nums);
        return newLength;
        //TODO   unCompleted
    }


}
