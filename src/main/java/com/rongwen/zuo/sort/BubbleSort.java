package com.rongwen.zuo.sort;

import com.rongwen.utils.Utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class BubbleSort {
    /**
     * 冒泡排序 O(N^2)
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        for (int i = arr.length - 1; i > 0; i--) {  // 0~i
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1])
                    Utils.swap(arr, j, j + 1);
            }
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Utils.duishuqi(BubbleSort.class.getMethod("bubbleSort",int[].class));
    }
}
