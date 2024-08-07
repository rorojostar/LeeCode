package com.rongwen.zuo.erfen;

/**
 * 有序数组，找>=某个数最左侧的位置
 */
public class BSNearLeft {
    public static int nearestIndex(int[] arr, int num) {
        int L = 0;
        int R = arr.length - 1;
        int index = -1;
        while (L < R) {
            int mid = L + ((R - L) >> 1);
            if (arr[mid] >= num) {
                index = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return index;
    }
}
