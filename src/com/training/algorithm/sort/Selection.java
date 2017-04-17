package com.training.algorithm.sort;

import com.training.algorithm.Utils;

/**
 * Created by j-yangbo on 2017/4/17.
 * <p>
 * 一种最简单的排序算法是这样的：首先，找到数组中最小的那个元素，其次，将它和数组的第
 * 一个元素交换位置（如果第一个元素就是最小元素那么它就和自己交换）。再次，在剩下的元素中
 * 找到最小的元素，将它与数组的第二个元素交换位置。如此往复，直到将整个数组排序。这种方法
 * 叫做选择排序，因为它在不断地选择剩余元素之中的最小者。
 * </p>
 */
public class Selection {
    public static void main(String[] args) {

        Selection selection = new Selection();

        selection.selectSort(SortUtils.roiginal);
    }


    public void selectSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }

        Utils.printArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int swapValue = array[j];
                    array[j] = array[i];
                    array[i] = swapValue;
                }
            }
        }
        System.out.println("after sort:");
        Utils.printArray(array);
    }
}
