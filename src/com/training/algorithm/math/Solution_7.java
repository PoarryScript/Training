package com.training.algorithm.math;

/**
 * Created by j-yangbo on 2017/4/14.
 *
 * 7. Reverse Integer
 *
 *
 * Reverse digits of an integer.
 *
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 * click to show spoilers.
 *
 * Have you thought about this?
 * Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
 *
 * If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 *
 * Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?
 *
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * Note:
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 *
 *
 *
 */
public class Solution_7 {
    public static void main(String[] args) {

        Solution_7 solution = new Solution_7();
        System.out.println(""+Integer.MAX_VALUE);
        System.out.println(""+Integer.MIN_VALUE);
        int test =-2147483648;
       System.out.println(""+solution.reverse(test));
    }

    public int reverse(int x) {
        boolean isNegative = false;
        if (x>=Integer.MAX_VALUE ||x<=Integer.MIN_VALUE){
            return 0;
        }
        if (x < 0) {
            isNegative = true;
            x = (0 - x);

        }
        int result = 0;
        while (x > 9) {
            result = result * 10;
            int temp = x % 10;
            result += temp;
            x = x / 10;
        }

        if (checkMultiplyExact(result, 10)) {
            result = result * 10;
        } else {
            return 0;
        }

        result += x;
        return isNegative ? (-result) : result;
    }

    private boolean checkMultiplyExact(int num, int scale) {
        long result = (long) num * (long) scale;
        if ((int) result != result) {
            //over flow
            return false;
        } else {
            return true;
        }
    }
}
