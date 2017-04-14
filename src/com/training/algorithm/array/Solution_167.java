package com.training.algorithm.array;

import com.training.algorithm.Utils;

/**
 * Created by j-yangbo on 2017/4/14.
 * <p>
 * 167. Two Sum II - Input array is sorted
 * <p>
 * <p>
 * <p>
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class Solution_167 {
    public static void main(String[] args) {
       /*  int[] test = {2, 3, 4,};
        int target = 6;*/
        /* int[] test = {2, 7, 11, 15};
        int target = 9;*/
         /*     int[] test = {2, 2, 2, 2};
            int target = 4; */
        /*int[] test = {-1,0};
        int target = -1;*/
        int[] test = {1,2,3,4,4,9,56,90};
        int target = 8;
        Solution_167 solution = new Solution_167();
        Utils.printArray(solution.twoSum(test, target));
        System.out.println("Binary Search");
        System.out.println("" + solution.binarySearch(test, 4,3));

    }

    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return numbers;
        }
        int formerIndex = 0, letterIndex = 0;
        int currentNeedFind;
        for (int i = 0; i < numbers.length; i++) {
            currentNeedFind = target - numbers[i];
            int searchResult = binarySearch(numbers, currentNeedFind,i+1);
            if (searchResult == -1) {
                continue;
            } else {
                formerIndex = i;
                letterIndex = searchResult;
                break;
            }
        }
        int[] result = {++formerIndex, ++letterIndex};
        return result;
    }

    private int binarySearch(int[] num, int targets,int startIndex) {
        if (num == null || num.length < 1) {
            return -1;
        }
        int endIndex = num.length - 1;
        int middleIndex = (startIndex + endIndex)/2;

        while (startIndex <= middleIndex) {
            if (num[middleIndex] > targets) {
                endIndex = middleIndex - 1;
                middleIndex = (startIndex + endIndex)/2;
            } else if (num[middleIndex] < targets) {
                startIndex = middleIndex + 1;
                middleIndex = (startIndex + endIndex)/2;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }
}
