package com.training.algorithm.bitmanipulation;

/**
 * Created by j-yangbo on 2017/4/27.
 *
 *
 *
 * 136. Single Number
 */
public class Solution_136 {
    public static void main(String[] args) {
        int[] test={1,2,3,4,5,4,3,2,1};

        Solution_136 solution_136 = new Solution_136();
        System.out.println("+:"+solution_136.singleNumber(test));

    }

    public int singleNumber(int[] nums) {

        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            c^=nums[i];
        }
        return c;
    }

}
