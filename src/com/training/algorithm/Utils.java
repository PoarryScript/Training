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
    public static void printStr(String msg){
        System.out.println("result===>"+msg);
    }
    public static void printInt(int msg){
        System.out.println("value===>"+msg);
    }

    public static void print2DimensionalArray(int[][] array) {
        if (array == null) {
            System.out.println("empty !!");
            return;
        }
        System.out.println("===================2DimensionalArray start============================");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {
                System.out.print("" + array[i][j] + "     ");
            }
            System.out.println("");

        }
        System.out.println("===================2DimensionalArray end============================");
    }
}
