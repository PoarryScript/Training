package com.training.algorithm.bitmanipulation;

/**
 * Created by j-yangbo on 2017/4/13.
 * 476. Number Complement
 * <p>
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 * <p>
 * Note:
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 * You could assume no leading zero bit in the integer’s binary representation.
 * Example 1:
 * Input: 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 * Example 2:
 * Input: 1
 * Output: 0
 * Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 */
public class Solution_476 {

    public static void main(String[] args) {
        System.out.println("" + (5 >>> 0));
        System.out.println("" + (5 >> 0));
        System.out.println("" + (5 << 0));
        System.out.println("" + ((Integer.toBinaryString(87))));
        System.out.println("" + (Integer.toBinaryString(5)));

        Solution_476 solution = new Solution_476();
        System.out.println("" + solution.convertInteger2Binary(87));

        System.out.println("" + (1 | 0));            //todo  OR (|)
        System.out.println("&" + (1 & 1));            //todo  AND (&)
        System.out.println("&" + (1 & 0));            //todo  AND (&)
        System.out.println("&" + (0 & 0));            //todo  AND (&)
        System.out.println("" + (10 << 2));          //todo  Left Shift (<<)
        System.out.println("" + (1100 >> 2));          //todo  Right Shift (>>)
        System.out.println("" + (~1));          //todo  Not (~)
    }


    // }

    public int findComplement(int num) {

        return Integer.parseInt(convertInteger2Binary(num),2);
    }

    private String convertInteger2Binary(int value) {
        if (value == 0) {
            return "0";
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (value >= 1) {
            stringBuffer.append((value % 2)==1?0:1);
            value = value / 2;
        }
        return stringBuffer.reverse().toString();
    }


}
