package com.rongwen.top100.subArray;

public class MaxSubArray {

    /**
     * 53. 最大子数组和
     * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * 子数组 是数组中的一个连续部分。
     * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
     * 输出：6
     *
     * @param nums
     * @return
     */

    public int maxSubArray(int[] nums) {
        int pre = 0, res = nums[0];
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            res = Math.max(pre, res);
        }
        return res;
    }
}
