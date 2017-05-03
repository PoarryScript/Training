package com.training.algorithm.array;

import com.training.algorithm.Utils;

/**
 * Created by j-yangbo on 2017/5/3.
 * <p>
 * <p>
 * 48. Rotate Image
 * <p>
 * You are given an n x n 2D matrix representing an image.
 * <p>
 * Rotate the image by 90 degrees (clockwise).
 * <p>
 * Follow up:
 * Could you do this in-place?
 */
public class Solution_48 {

    public static void main(String[] args) {

        int[][] testCase2 = {{1, 2, 3, 4, 5, 6, 7}};
        int[][] testCase3 = {{1}, {2}, {3}, {4}, {5}, {6}, {7}};
        int[][] testCase6 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] testCase4 = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}};
        int[][] testCase5 = {{1, 2}, {3, 4}};

      /*  Utils.print2DimensionalArray(testCase1);
        System.out.println(testCase1[0][1]);
        System.out.println(testCase1[3][1]);*/
        Solution_48
                solution_48 = new Solution_48();

        solution_48.rotate(testCase4);
    }


    public void rotate(int[][] matrix) {

        if (matrix == null) {
            return;
        }
        Utils.print2DimensionalArray(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    int swapValue = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = swapValue;
                }
            }
        }
        Utils.print2DimensionalArray(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int swapValue = 0;
                swapValue =matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = swapValue;
            }
        }


        Utils.print2DimensionalArray(matrix);

    }


}
