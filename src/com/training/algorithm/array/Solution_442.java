package com.training.algorithm.array;

import com.training.algorithm.Utils;
import com.training.algorithm.linkedlist.ListNode;
import com.training.algorithm.math.Solution_2;

import java.util.*;

/**
 * Created by j-yangbo on 2017/4/14.
 * <p>
 * 442. Find All Duplicates in an Array
 * <p>
 * <p>
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * <p>
 * Find all the elements that appear twice in this array.
 * <p>
 * Could you do it without extra space and in O(n) runtime?
 * <p>
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * Output:
 * [2,3]
 */
public class Solution_442 {

    public static void main(String[] args) {
        Solution_442 solution = new Solution_442();
//        int[] test = {4, 3, 2, 7, 7,4,8, 2, 3, 1};
        int[] test = {0,1,2,3,0};


        Utils.printIntegerList(solution.findDuplicates(test));

    }

    public List<Integer> findDuplicates(int[] nums) {
        if (nums == null || nums.length < 2) {
            return new ArrayList<>();
        }
        Set<Integer> sets = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            if (!sets.contains(nums[i])) {
                sets.add(nums[i]);
            } else {
                result.add(nums[i]);
            }
        }
        return result;
    }

}
