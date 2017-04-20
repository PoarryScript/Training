package com.training.algorithm.Matrix;

import com.training.algorithm.Utils;

/**
 * Created by j-yangbo on 2017/4/20.
 * <p>
 * //矩阵乘法
 */
public class Matrix {

    public static void main(String[] args) {
        int[][]  test ={{1,2,3},{4,5,6}};
        int[][]  test2 ={{1,4},{2,5},{3,6}};
        Matrix matrix = new Matrix();

        int[][] result = matrix.MatrixProduct(test,test2);
        Utils.print2DimensionalArray(result);

    }

    private int[][] MatrixProduct(int[][] multiplierMatrix, int[][] multipliedMatrix) {
        if (multiplierMatrix == null || multipliedMatrix == null) {
            System.out.println("empty Multiplier or Multiplied!!!");
            return multiplierMatrix;
        }
        if (multiplierMatrix[0].length != multipliedMatrix.length) {
            System.out.println("incompatiable dimensions !!!");
        }

        int result[][] = new int[multiplierMatrix.length][multipliedMatrix[0].length];

        for (int i = 0; i < multiplierMatrix.length; i++) {

            for (int j = 0; j < multipliedMatrix[0].length; j++) {

                for (int k = 0; k < multiplierMatrix[0].length; k++) {
                    result[i][j] += multiplierMatrix[i][k] * multipliedMatrix[k][j];
                }

            }
        }

        return result;
    }
}
