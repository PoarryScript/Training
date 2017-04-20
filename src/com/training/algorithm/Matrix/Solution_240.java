package com.training.algorithm.Matrix;

/**
 * Created by j-yangbo on 2017/4/20.
 * <p>
 * 240. Search a 2D Matrix II
 * <p>
 * <p>
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 * <p>
 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 * For example,
 * <p>
 * Consider the following matrix:
 * <p>
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * Given target = 5, return true.
 * <p>
 * Given target = 20, return false.
 */
public class Solution_240 {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30},};

//        int target  = 5;
        int target = 20;
        Solution_240 solution_240 = new Solution_240();
        boolean find = solution_240.searchMatrix(matrix, target);
        System.out.println("" + find);

    }
/*
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }
        if (matrix.length == 0 || matrix[0].length < 0) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == target) {
                    return true;
                }

            }
        }
        return false;

    }*/


    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }
        if (matrix.length == 0 || matrix[0].length < 0) {
            return false;
        }

        int row = 0;
        int column = matrix[0].length - 1;


        while (row < matrix.length && column > 0) {
            int currentNum = matrix[row][column];
            if (currentNum==target){
                return true;
            }else if (currentNum>target){
                column--;
            }else {
                row++;
            }
        }
        return false;

    }


}
