package com.training.algorithm.sort;

import com.training.algorithm.Utils;

/**
 * Created by j-yangbo on 2017/4/18.
 * <p>
 * 希尔排序
 * 为了展示初级排序算法性质的价值，接下来我们将学习一种基于插入排序的快速的排序算法。
 * 对于大规模乱序数组插入排序很慢，因为它只会交换相邻的元素，因此元素只能一点一点地从数组
 * 的一端移动到另一端。例如，如果主键最小的元素正好在数组的尽头，要将它挪到正确的位置就需
 * 要 N -1 次移动。希尔排序为了加快速度简单地改进了插入排序，交换不相邻的元素以对数组的局部
 * 进行排序，并最终用插入排序将局部有序的数组排序。
 * 希尔排序的思想是使数组中任意间隔为 h 的元素都是有序的。这样的数组被称为 h 有序数组。换
 * 句话说，一个 h 有序数组就是 h 个互相独立的有序数组编织在一起组成的一个数组（见图 2.1.2）。
 * 在进行排序时，如果 h 很大，我们就能将元素移动到很远的地方，为实现更小的 h 有序创造方便。用
 * 这种方式，对于任意以 1 结尾的 h 序列，我们都能够将数组排序。这就是希尔排序。算法 2.3 的实现
 * 使用了序列 1/2（3 k -1），从 N /3 开始递减至 1。我们把这个序列称为递增序列。算法 2.3 实时计算了
 * 它的递增序列，另一种方式是将递增序列存储在一个数组中。
 * L E E A M H L E P S O L T S X R
 * L M P T
 * E H S S
 * E L O X
 * A E L R
 * h= 4
 * 图 2.1.2 一个 h 有序数组 即一个由 h 个有序子数组组成的数组
 * 实现希尔排序的一种方法是对于每个 h，用插入排序将 h 个子数组独立地排序。但因为子数组
 * 是相互独立的，一个更简单的方法是在 h- 子数组中将每个元素交换到比它大的元素之前去（将比它
 * 大的元素向右移动一格）。只需要在插入排序的代码中将移动元素的距离由 1 改为 h 即可。这样，希
 * 尔排序的实现就转化为了一个类似于插入排序但使用不同增量的过程。
 * 希尔排序更高效的原因是它权衡了子数组的规模和有序性。排序之初，各个子数组都很短，排
 * 257
 */
public class ShellSort {

    public static void main(String[] args) {

        ShellSort shellSort = new ShellSort();
        shellSort.shell(SortUtils.roiginal);
    }

    public void shell(int[] array) {

        if (array == null || array.length < 2) {
            return;
        }
        Utils.printArray(array);
        int length = array.length;
        int h = 1;
        while (h < length / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h && (array[j] < array[j - h]); j -= h) {
                    int swap = array[j];
                    array[j] = array[j - h];
                    array[j - h] = swap;
                }

            }
            h = h / 3;
        }
        System.out.println("After Shell  sort");
        Utils.printArray(array);
    }
}
