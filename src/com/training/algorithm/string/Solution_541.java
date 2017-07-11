package com.training.algorithm.string;

/**
 * Created by j-yangbo on 2017/5/4.
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 541. Reverse String II
 * <p>
 * <p>
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
 * Example:
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 * Restrictions:
 * The string consists of lower English letters only.
 * Length of the given string and k will in the range [1, 10000]
 */
public class Solution_541 {

    public String reverseStr(String s, int k) {


        if (s == null || k < 1) {
            return s;
        }
        if (k >= s.length()) {
            return reverseString(s);
        }

        StringBuffer result = new StringBuffer();

        String newString = s;
        int flag = 0;
        while (newString.length() > 0) {
            if (newString.length() < k) {
                result.append(newString);
                break;
            }
            String subStr;
            if (flag % 2 == 0) {
                String reverseSubStr = newString.substring(0, k);
                subStr = reverseString(reverseSubStr);
                result.append(subStr);
            } else {
                subStr = newString.substring(0, k);
                result.append(subStr);
            }
            flag++;

            newString = newString.substring(k);

        }
        return result.toString();

    }

    private String reverseString(String str) {
        StringBuffer buffer = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            buffer.append(str.charAt(i));
        }
        return buffer.toString();
    }

    public static void main(String[] args) {

        Solution_541 solution_541 = new Solution_541();

        String testCase = "abcdefg";
        int reverseIndex = 2;
        String result = solution_541.reverseStr(testCase, reverseIndex);

        System.out.println(result);
    }
}


