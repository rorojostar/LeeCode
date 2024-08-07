package com.rongwen.utils;

import com.rongwen.zuo.sort.InsertSort;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Utils {
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //i!=j,
    public static void swap2(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }


    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }

    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    //实现一个随机样本产生器
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        //Math.random() -> [0,1)所有的小数，等概率返回一个
        //Math.random()*N -> [0,N)所有小数，等概率返回一个
        //(int)(Math.random()*N) -> [0,N-1]所有的整数，等概率返回一个
        int[] arr = new int[(int) (Math.random() * (maxSize + 1))];//长度随机
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) ((maxValue) * Math.random());
        }
        return arr;
    }

    public static int[] copyArray(int[] arr) {
        if (arr == null) return null;
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    //实现比对的方法
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) return true;
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    //对数器
    public static void duishuqi(Method method) throws InvocationTargetException, IllegalAccessException {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;

        for (int i = 0; i < testTime; i++) {
            int[] arr1 = Utils.generateRandomArray(maxSize, maxValue);
            int[] arr2 = Utils.copyArray(arr1);
            method.invoke(method.getClass(), arr1);
            Utils.comparator(arr2);
            if (!Utils.isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? method.getName() + " is nice" : method.getName() + " is shit");
    }


}
