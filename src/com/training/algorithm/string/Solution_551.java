package com.training.algorithm.string;

/**
 * Created by j-yangbo on 2017/4/17.
 * <p>
 * 551. Student Attendance Record I
 * <p>
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:
 * <p>
 * 'A' : Absent.
 * 'L' : Late.
 * 'P' : Present.
 * A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
 * <p>
 * You need to return whether the student could be rewarded according to his attendance record.
 * <p>
 * Example 1:
 * Input: "PPALLP"
 * Output: True
 * Example 2:
 * Input: "PPALLL"
 * Output: False
 */
public class Solution_551 {

    public static void main(String[] args) {
        Solution_551 solution = new Solution_551();
//        String record = "PPALLP";
//        String record = "PPALLL";
        String record = "LALLL";
//        String record = "LALLLL";
        System.out.println("" + solution.checkRecord(record));

    }

    public boolean checkRecord(String s) {
        if (s == null || s.length() < 1) {
            return true;
        }
        int length = s.length();
        String absentStr = s.replace("A", "");
        if (length - absentStr.length() > 1) {
            return false;
        }
        String latterStr = s.replace("LLL", "");
        if (length - latterStr.length() > 1) {
            return false;
        }
        return true;

    }
}
