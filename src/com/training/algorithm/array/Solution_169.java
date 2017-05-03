package com.training.algorithm.array;

import java.util.Arrays;
import java.util.List;

/**
 * Created by j-yangbo on 2017/5/3.
 * <p>
 * <p>
 * 169. Majority Element
 * <p>
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class Solution_169 {

    public static void main(String[] args) {

        Solution_169 solution_169 = new Solution_169();
        int[] testCase = {1, 2, 1, 3, 1, 4, 1, 3, 1, 9, 1, 6, 1, 45, 1, 6, 1, 31, 1};
        int[] testCase1 = {3,3,4};
        int[] testCase2 = {6,5,5};
        System.out.println("" + solution_169.majorityElement(testCase));

    }

    /*public int majorityElement(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        return nums[nums.length/2];

    }*/

    public int majorityElement(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int result = 0;
        int count  =0;
        for (int i = 0; i < nums.length; i++) {
            if (count==0){
                result = nums[i];
                count=1;
            }else if (result==nums[i]){
                count++;
            }else {
                count--;
            }
        }

        return result;

    }

}
