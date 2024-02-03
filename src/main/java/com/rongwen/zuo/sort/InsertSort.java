package com.rongwen.zuo.sort;

import com.rongwen.utils.Utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class InsertSort {

    /**
     * 插入排序  最坏情况：O(N^2),和数据状况有关
     */
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) { //0~i范围上做到有序
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                Utils.swap(arr, j, j + 1);
            }
        }
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Utils.duishuqi(InsertSort.class.getMethod("insertSort",int[].class));
    }


}
