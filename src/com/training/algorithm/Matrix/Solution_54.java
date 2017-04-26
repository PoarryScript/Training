package com.training.algorithm.Matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j-yangbo on 2017/4/20.
 * <p>
 * 54. Spiral Matrix
 * <p>
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * <p>
 * For example,
 * Given the following matrix:
 * <p>
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * You should return [1,2,3,6,9,8,7,4,5].
 */
public class Solution_54 {

    public static void main(String[] args) {

    }

    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> order = new ArrayList<>();

        int countRow = 0;
        int row = matrix.length;
        int column=matrix[0].length;
        int countColumn =0;
        while (countRow < row) {

            for (int i = countRow; i < matrix.length - countRow; i++) {

                //top
                System.out.println("" + matrix[countRow][i]);

            }

            countRow++;

            for (int i = countRow; i < matrix[0].length; i++) {
                //right
                System.out.println("" + matrix[column-countColumn][i]);
            }
            countColumn++;

            for (int i = countRow; i < matrix[0].length; i++) {
                //bottom
                System.out.println("" + matrix[column-countColumn][i]);
            }
            countColumn++;


        }


        return new ArrayList<>();
    }
}
