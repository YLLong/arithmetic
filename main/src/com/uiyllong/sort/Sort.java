package com.uiyllong.sort;

/**
 *
 * Created by uilong on 2016/5/16.
 */
public class Sort {

    /**
     * 快速排序法：结合二分法的思想，以数组中间那个值作为标兵是最快的。
     * 二分，递归
     * i 是左边的游标     j 是右边的游标
     * t 是标兵        temp 是临时变量
     * @param arr
     * @param left
     * @param right
     */
    public void quicksort(int[] arr, int left, int right) {
        int i, j, t, temp;
        t = arr[(left + right)/2];
        i = left;
        j = right;
        while (i <j) {
            while (arr[i] < t)
                i++;
            while (arr[j] > t)
                j--;
            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (i == j)
            i++;
        if (left < j)
            quicksort(arr, left, i - 1);
        if (i < right)
            quicksort(arr, j + 1, right);
    }

}
