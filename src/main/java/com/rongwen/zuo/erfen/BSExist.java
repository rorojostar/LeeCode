package com.rongwen.zuo.erfen;

import com.rongwen.utils.Utils;

import java.util.Arrays;

/**
 * 二分法：有序数组，判断一个数是否存在
 */
public class BSExist {
    public static boolean exist(int[] arr, int num) {
        if (arr == null || arr.length == 0) return false;
        int L = 0;
        int R = arr.length - 1;
        int mid = 0;

        while (L < R) {
            mid = L + ((R - L) >> 1);
            if (arr[mid] == num) return true;
            else if (arr[mid] > num) R = mid - 1;
            else L = mid + 1;
        }
        return arr[mid] == num;
    }

    public static void main(String[] args) {
        int[] ints ={-8, 28, -57, -75, 16, 3, 35, 1};
        System.out.println(Arrays.toString(ints));
        boolean exist = BSExist.exist(ints, 3);
        System.out.println(exist);
    }
}
