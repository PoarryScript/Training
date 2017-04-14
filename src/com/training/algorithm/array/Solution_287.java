package com.training.algorithm.array;

/**
 * Created by j-yangbo on 2017/4/14.
 * <p>
 * 287. Find the Duplicate Number
 * <p>
 * <p>
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 * <p>
 * Note:
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once.
 */
public class Solution_287 {
    public static void main(String[] args) {

        Solution_287 solution = new Solution_287();
        int[] test={1,0,9,34,5,2,4,6,8,9,3};
//        int[] test={1,3,4,2,2};
        System.out.println(""+solution.findDuplicate(test));
    }


    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return -1;
        }
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1;j <nums.length; j++) {
                if (nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }


}
