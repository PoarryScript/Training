package com.training.algorithm.string;

/**
 * Created by j-yangbo on 2017/4/17.
 * <p>
 * 415. Add Strings
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 * <p>
 * Note:
 * <p>
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class Solution_415 {

    public static void main(String[] args) {
        Solution_415 solution = new Solution_415();
        /*String num1 = "123";
        String num2 = "123";*/
/*
         String num1 = "9";
        String num2 = "0";*/

        /*String num1 = "19";
        String num2 = "0";*/
        String num1 = "19";
        String num2 = "9";

        System.out.println("" + solution.addStrings(num1, num2));
    }

    public String addStrings(String num1, String num2) {

        if (num1 == null || num2 == null) {
            return num1 + num2;
        }

        int maxLength = num1.length() > num2.length() ? num1.length() : num2.length();


        boolean needCarry = false;
        int carrySum = 0;
        StringBuffer buffer = new StringBuffer();
        for (int i = maxLength ; i >= 0; i--) {
            int currentNum1 = num1.length() > i ? num1.charAt(i) - '0' : 0;
            int currentNum2 = num2.length() > i ? num2.charAt(i) - '0' : 0;
            int bitSum = (currentNum1 + currentNum2) % 10;

            System.out.println("currentNum1:" + currentNum1);
            System.out.println("currentNum2:" + currentNum2);
            if (needCarry) {
                if (bitSum + 1 > 9) {
                    bitSum = 0;
                }else {
                    bitSum=bitSum+carrySum;
                }
                buffer.insert(0, bitSum);
            } else {
                buffer.insert(0, bitSum);

            }
            needCarry = (currentNum1 + currentNum2 > 9);
            if (needCarry){
                carrySum = (currentNum1 + currentNum2) /10;
                if (bitSum+1>0){
                    carrySum++;
                }
            }
            System.out.println("needCarry:" + needCarry);
            System.out.println("bitSum:" + bitSum);
        }
        return buffer.toString();
    }

}
