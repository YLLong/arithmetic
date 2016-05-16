package com.uiyllong.main;

import com.uiyllong.sort.Sort;

/**
 * Created by uilong on 2016/5/16.
 */
public class TestMain {

    public static final int SIZE = 18;

    public static void main(String[] args) {

        int[] shuzu = new int[SIZE];
        int i;
        for (i = 0; i < SIZE; i++) {
            shuzu[i] = (int) (Math.random()*101 + 100);
        }
        System.out.print("排序前的数组:");
        for (i = 0; i < SIZE; i++) {
            System.out.print(shuzu[i] + " ");
        }
        System.out.println("\n");

        long start = System.currentTimeMillis();
        Sort quickSort = new Sort();
        quickSort.quicksort(shuzu, 0, SIZE - 1);
        long end = System.currentTimeMillis();
        System.out.print("快速排序后的数组为:");
        for (i = 0; i < SIZE; i++) {
            System.out.print(shuzu[i] + " ");
        }
        System.out.println("\n");
        System.out.println("快速排序法花费时间:" + (end - start) + "ms");

    }

}
