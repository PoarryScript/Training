package com.training.algorithm;

import java.util.List;

/**
 * Created by j-yangbo on 2017/4/7.
 */
public class Utils {


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "->" + array[i]);
        }
    }

    public static void printIntegerList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "->" + list.get(i));

        }
    }
}
