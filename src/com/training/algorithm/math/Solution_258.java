package com.training.algorithm.math;

/**
 * Created by j-yangbo on 2017/4/14.
 * <p>
 * 258. Add Digits
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * <p>
 * For example:
 * <p>
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * <p>
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 * <p>
 * Hint:
 * <p>
 * A naive implementation of the above process is trivial. Could you come up with other methods? Show More Hint
 */
public class Solution_258 {
    public static void main(String[] args) {
        Solution_258 solution = new Solution_258();

        int test = 38;
        System.out.println("" + solution.addDigits(test));
        System.out.println("" +(4+ (String.valueOf(test).charAt(0))));
        System.out.println("" + (String.valueOf(test).charAt(0)));
    }

    public int addDigits(int num) {

        int sum = 0;
        String newNumStr = String.valueOf(num);
        for (int i = 0; i < newNumStr.length(); i++) {
            sum+=(newNumStr.charAt(i)-'0');
        }
        if (sum<10){
            return sum;
        }else {
            return addDigits(sum);
        }
    }

}
