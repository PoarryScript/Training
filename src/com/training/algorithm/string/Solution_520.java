package com.training.algorithm.string;

import com.training.algorithm.tree.Solution_199;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by j-yangbo on 2017/4/13.
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 520. Detect Capital
 * <p>
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * <p>
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * <p>
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital if it has more than one letter, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 * Example 1:
 * Input: "USA"
 * Output: True
 * Example 2:
 * Input: "FlaG"
 * Output: False
 * Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */
public class Solution_520 {
    public static void main(String[] args) {
        Solution_520 solution = new Solution_520();
        String test = "UUUUUUUUUU";

        System.out.println("" + solution.detectCapitalUse(test));
    }

    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() < 2) {
            return true;
        }
        String upperCase = "[A-Z]+";
        Pattern upperCasePattern = Pattern.compile(upperCase);
        Matcher upperCaseMatcher = upperCasePattern.matcher(word);
        String lowerCase = "[a-z]+";
        Pattern lowerCasePattern = Pattern.compile(lowerCase);
        Matcher lowerCaseMatcher = lowerCasePattern.matcher(word);


        String oneCapital = "[A-Z][a-z]+";
        Pattern oneCapitalPattern = Pattern.compile(oneCapital);
        Matcher oneCapitalPatternMatcher = oneCapitalPattern.matcher(word);

        return upperCaseMatcher.matches() || oneCapitalPatternMatcher.matches()||lowerCaseMatcher.matches();
    }
}
