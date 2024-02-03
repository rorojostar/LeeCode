package com.rongwen.zuo.test;

public class Test03 {
    /**
     * 小和问题：在一个数组中，每一个数左边比当前数小的数累加起来，叫做这个数组的小和。求一个数组的小和。
     * 例如：[1,3,4,2,5]，
     * 1左边比1小的数，没有；
     * 3左边比3小的数，1；
     * 4左边比4小的数，1、3；
     * 2左边比2小的数，1；
     * 5左边比5小的数，1、3、4、2
     * 所以小和为：1+1+3+1+1+3+4+2=16
     * 暴力解法：O(N^2)
     * 转换思路：看一个数右边有几个数比它大，有几个就加几个这个数
     * 如：
     * 1右边比1大的数有4个，1*4
     * 3右边比3大的数有2个，3*2
     * 4右边比4大的数有1个，4*1
     * 2右边比2大的数有1个，2*1
     * 5右边比5大的数有0个，0
     * 和为16
     */

    public int smallSum(int[] arr) {
        if (arr == null || arr.length < 2) return 0;
        return process(arr, 0, arr.length - 1);
    }

    public int process(int[] arr, int L, int R) {
        if (L == R) return 0;
        int mid = L + ((R - L) >> 1);
        return process(arr, L, mid) + process(arr, mid + 1, R) + merge(arr, L, mid, R);
    }

    public int merge(int[] arr, int L, int mid, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        int res = 0;
        while (p1 <= mid && p2 <= R) {
            res += arr[p1] < arr[p2] ? (R - p2 + 1) * arr[p1] : 0;
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
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
        System.out.println(new Test03().smallSum(arr));
    }

}
