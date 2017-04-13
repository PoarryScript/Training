package com.training.algorithm.string;

import com.training.algorithm.tree.Solution_199;

/**
 * Created by j-yangbo on 2017/4/13.
 * <p>
 * 44. Wildcard Matching
 * <p>
 * <p>
 * Implement wildcard pattern matching with support for '?' and '*'.
 * <p>
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * <p>
 * The matching should cover the entire input string (not partial).
 * <p>
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * <p>
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "*") → true
 * isMatch("aa", "a*") → true
 * isMatch("ab", "?*") → true
 * isMatch("aab", "c*a*b") → false
 */
public class Solution_44 {
    public static void main(String[] args) {
        Solution_44 solution = new Solution_44();
        String tests = "aa";
        String testp = "a";
        solution.isMatch(tests, testp);
    }

    public boolean isMatch(String s, String p) {
        if (s == null && p == null) {
            return true;
        }
        if (s.equalsIgnoreCase(p)) {
            return true;
        }

        return true;

    }
}
