package com.rongwen.zuo.sort;

import com.rongwen.utils.Utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class SelectSort {

    /**
     * 选择排序 O(N^2)
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        for (int i = 0; i < arr.length - 1; i++) { //i~N-1
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) { //i~N-1上找最小值的下标
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            Utils.swap(arr, i, minIndex);
        }
    }


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Utils.duishuqi(SelectSort.class.getMethod("selectSort",int[].class));
    }
}
