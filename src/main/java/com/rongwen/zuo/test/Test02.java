package com.rongwen.zuo.test;

import com.rongwen.utils.Utils;

import java.util.Arrays;

public class Test02 {
    /**
     * 用递归方法找一个数组的最大值
     */
    public int getMaxByRecursion(int[] arr, int L, int R) {
        if (L == R) return arr[L];
        int mid = L + ((R - L) >> 1); //中点
        int leftMax = getMaxByRecursion(arr, L, mid);
        int rightMax = getMaxByRecursion(arr, mid + 1, R);
        return Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {
        int[] arr = Utils.generateRandomArray(100, 10000);
        System.out.println(new Test02().getMaxByRecursion(arr, 0, arr.length - 1));
    }
}
