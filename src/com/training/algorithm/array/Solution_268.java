package com.training.algorithm.array;

/**
 * Created by j-yangbo on 2017/4/7.
 * <p>
 * Missing Number
 */
public class Solution_268 {
    public static void main(String[] args) {

        int[] test = {0, 1, 2, 4};

        Solution_268 solution = new Solution_268();
        System.out.println("missingNumber:" + solution.missingNumber(test));
        System.out.println("" + (3 ^ 2 ));
        System.out.println("" + (2 ^ 2 ));




    }

    /* public int missingNumber(int[] nums) {

         if (nums.length < 1) {
             return 0;
         }

         for (int i = 1; i < nums.length - 1; i++) {
             if (nums[i] + 1 != nums[i + 1]) {
                 return nums[i] + 1;
             }
         }
         return nums[0] == 0 ? nums[nums.length - 1] + 1 : 0;
     }*/
    private int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }




}
