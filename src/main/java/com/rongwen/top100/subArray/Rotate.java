package com.rongwen.top100.subArray;

import com.rongwen.utils.Utils;

public class Rotate {
    /**
     * 189. 轮转数组
     * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
     * 输入: nums = [1,2,3,4,5,6,7], k = 3
     * 输出: [5,6,7,1,2,3,4]
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        Utils.reverse(nums, 0, nums.length - 1);
        Utils.reverse(nums, 0, k - 1);
        Utils.reverse(nums, k, nums.length - 1);
    }
}
