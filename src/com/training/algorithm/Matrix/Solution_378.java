package com.training.algorithm.Matrix;

import com.training.algorithm.Utils;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by j-yangbo on 2017/4/20.
 * <p>
 * 378. Kth Smallest Element in a Sorted Matrix
 * Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.
 * <p>
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 * <p>
 * Example:
 * <p>
 * matrix = [
 * [ 1,  5,  9],
 * [10, 11, 13],
 * [12, 13, 15]
 * ],
 * k = 8,
 * <p>
 * return 13.
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ n2.
 */
public class Solution_378 {
    public static void main(String[] args) {

        int[][] matrix = {{1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}};

        Solution_378 solution_378 = new Solution_378();

        int result = solution_378.kthSmallest(matrix, 8);
        System.out.println("-->" + result);
    }

    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null) {
            return 0;
        }
        if (matrix.length * matrix[0].length < k) {
            return 0;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                arrayList.add(matrix[i][j]);
            }
        }

        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        Utils.printIntegerList(arrayList);
        return arrayList.get(k-1);
    }
}
