package com.training.algorithm.heap;

import com.training.algorithm.Utils;

import java.util.LinkedList;

/**
 * Created by j-yangbo on 2017/4/20.
 * <p>
 * <p>
 * 239. Sliding Window Maximum
 * <p>
 * <p>
 * Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 * <p>
 * For example,
 * Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.
 * <p>
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 * 1 [3  -1  -3] 5  3  6  7       3
 * 1  3 [-1  -3  5] 3  6  7       5
 * 1  3  -1 [-3  5  3] 6  7       5
 * 1  3  -1  -3 [5  3  6] 7       6
 * 1  3  -1  -3  5 [3  6  7]      7
 * Therefore, return the max sliding window as [3,3,5,5,6,7].
 * <p>
 * Note:
 * You may assume k is always valid, ie: 1 ≤ k ≤ input array's size for non-empty array.
 */
public class Solution_239 {

    public static void main(String[] args) {
       /*  int[] test = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;*/
       /* int[] test = {-7,-8,7,5,7,1,6,0};

        int k = 4;*/
        int[] test = {7,2,4};
        int k = 2;
       /* int[] test = {1, -1};
        int k = 1;*/

        Solution_239 solution_239 = new Solution_239();
        int[] result = solution_239.maxSlidingWindow(test, k);
        Utils.printArray(result);
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null||nums.length==0) {
            return new int[0];
        }
        int[] result=new int[nums.length-k+1];

        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!deque.isEmpty()&&deque.peekFirst()==i-k) {
                deque.poll();
            }
            while (!deque.isEmpty() &&nums[deque.peekLast()]<nums[i]){
                deque.removeLast();
            }
            deque.offer(i);
            if (i+1>=k){
                result[i+1-k]=nums[deque.peek()];
            }
        }
        return result;
       /* if (nums == null || nums.length < k) {
            return nums;
        }

        ArrayList<Integer> result = new ArrayList<>();
        int currentMaxValue = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            for (int j = 0; j < k; j++) {
                if (nums[i + j] > currentMaxValue) {
                    currentMaxValue = nums[i + j];
                }
                if (j == k-1) {
                    result.add(currentMaxValue);
                }

            }
        }

        Utils.printIntegerList(result);

        int[] array = new int[result.size()];

        Integer[] iarray = result.toArray(new Integer[result.size()]);
        for (int i = 0; i < iarray.length; i++) {
            array[i] = iarray[i];
        }
        return array;*/


    }


}
