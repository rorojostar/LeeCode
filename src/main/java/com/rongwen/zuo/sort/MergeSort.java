package com.rongwen.zuo.sort;

import com.rongwen.utils.Utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class MergeSort {
    /**
     * 归并排序 O(NlogN)
     */

    public static void mergeSort(int[] arr) {
        process(arr, 0, arr.length - 1);
    }

    public static void process(int[] arr, int L, int R) {
        if (L == R) return;
        int mid = L + ((R - L) >> 1); //(L+R)/2 会溢出 不安全
        process(arr, L, mid);
        process(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int mid, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;

        while (p1 <= mid && p2 <= R) {
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }

        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        int[] arr1 = Utils.generateRandomArray(10, 100);

        mergeSort(arr1);
    }
}
