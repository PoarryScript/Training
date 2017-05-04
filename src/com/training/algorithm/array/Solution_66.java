package com.training.algorithm.array;

import com.sun.deploy.util.ArrayUtil;
import com.training.algorithm.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by j-yangbo on 2017/5/3.
 * <p>
 * 66. Plus One
 * <p>
 * <p>
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * <p>
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class Solution_66 {
    public static void main(String[] args) {

        int[] testCase = {1, 3, 5, 5};
        int[] testCase1 = {9};
        int[] testCase7 = {0};
        int[] testCase2 = {1, 2, 9};
        int[] testCase3 = {1, 9, 9};
        int[] testCase8 = {9, 9, 9};
        int[] testCase4 = {1, 3, 5, 5};
        int[] testCase5 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        Solution_66 solution_66 = new Solution_66();
        int[] result = solution_66.plusOne(testCase3);
//        Utils.printArray(result);
    }

    public int[] plusOne(int[] digits) {

        if (digits == null) {
            return new int[0];
        }
        int needCarry = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (i==digits.length-1 &&digits[i]<9){
                digits[i]++;
                break;
            }
            if (digits[i] == 9) {
                needCarry = 1;
                digits[i] = 0;
                continue;
            }
            if (needCarry == 1) {
                if (digits[i] + needCarry > 9) {
                    digits[i] = 0;
                    needCarry = 1;
                } else {
                    digits[i]++;
                    break;
                }
            }

        }
        int[] resultArray = new int[digits.length + 1];
        Arrays.fill(resultArray, 0);
        if (digits[0] == 0) {
            resultArray[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                resultArray[i + 1] = digits[i];
            }
            Utils.printArray(resultArray);
            return resultArray;
        }


        Utils.printArray(digits);
        return digits;
    }


}
