package com.training.algorithm.string;

/**
 * Created by j-yangbo on 2017/4/13.
 * <p>
 * 557. Reverse Words in a String III
 * <p>
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * <p>
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class Solution_557 {

    public static void main(String[] args) {
        Solution_557 solution = new Solution_557();
        String test = "Let's take LeetCode contest";
        System.out.println("" + solution.reverseWords(test));

    }

    public String reverseWords(String s) {
        if (s == null || s.length() < 1) {
            return s;
        }
        String[] arrays = s.split(" ");
        StringBuffer reverseStr = new StringBuffer();
        for (int i = 0; i < arrays.length; i++) {
            reverseStr.append(reverseWord(arrays[i]));
            reverseStr.append(" ");
        }

        return reverseStr.substring(0, reverseStr.length() - 1);
    }

    private String reverseWord(String word) {
        StringBuffer stringBuffer = new StringBuffer();
        if (word == null || word.length() < 1) {
            return stringBuffer.toString();
        }
        if (word.length() < 2) {
            return word;
        }
        for (int i = 0; i < word.length(); i++) {
            stringBuffer.insert(0, word.charAt(i));
        }

        return stringBuffer.toString();
    }

}
