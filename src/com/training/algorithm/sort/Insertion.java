package com.training.algorithm.sort;

import com.training.algorithm.Utils;

/**
 * Created by j-yangbo on 2017/4/17.
 * <p>
 * 在计算机的实现中，为了给要插入的元素腾出空间，我们需要将其余所有元素在插入之前都向右移
 * 动一位。这种算法叫做插入排序
 */
public class Insertion {
    public static void main(String[] args) {

        Insertion insertion = new Insertion();

        insertion.insertSort(SortUtils.roiginal);
    }

    public void insertSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        Utils.printArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                int swapValue = array[j - 1];
                array[j - 1] = array[j];
                array[j] = swapValue;
            }
        }
        System.out.println("after sort");
        Utils.printArray(array);
    }
}
