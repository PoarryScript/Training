package com.training.algorithm.string;

import com.training.algorithm.math.Solution_2;

/**
 * Created by j-yangbo on 2017/4/
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 28. Implement strStr()
 * <p>
 * Implement strStr().
 * <p>
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class Solution_28 {
    public static void main(String[] args) {

        Solution_28 solution = new Solution_28();
      /*  String haystack = "salssskassshasldh";
        String needle = "asss";*/
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println("" + solution.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        int startIndex = -1;

        if (haystack == null || needle == null) {
            return 0;
        }
        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length())
                return -1;

            int m = i;
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) == haystack.charAt(m)) {
                    if (j == needle.length() - 1)
                        return i;
                    m++;
                } else {
                    break;
                }

            }
        }
        return -1;
    }

}
