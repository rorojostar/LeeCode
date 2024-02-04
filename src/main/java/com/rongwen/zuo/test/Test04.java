package com.rongwen.zuo.test;

public class Test04 {
    /**
     * 逆序对问题
     * 在一个数组中，左边的数如果比右边的数大，则这两个数构成一个逆序对，请打印所有逆序对
     */

    public int reverseParis(int[] arr) {
        if (arr == null || arr.length < 2) return 0;
        return process(arr, 0, arr.length - 1);
    }

    public int process(int[] arr, int L, int R) {
        if (L == R) return 0;

        int mid = L + ((R - L) >> 1);
        if (arr[mid] <= arr[mid + 1]) return process(arr, L, mid) + process(arr, mid + 1, R);

        return process(arr, L, mid) + process(arr, mid + 1, R) + merge(arr, L, mid, R);
    }

    public int merge(int[] arr, int L, int mid, int R) {
        int[] help = new int[R - L + 1];
        int p1 = L;
        int p2 = mid + 1;
        int i = 0;
        int res = 0;

        while (p1 <= mid && p2 <= R) {
        }
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }

        return 0;
    }


}
