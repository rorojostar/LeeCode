package com.rongwen.top100.doublePoint;

public class MaxArea {
    /**
     * middle
     * 11. 盛最多水的容器
     * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
     * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     * 返回容器可以储存的最大水量。
     * 输入：[1,8,6,2,5,4,8,3,7]
     * 输出：49
     * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
     *
     * @param height
     * @return
     */

    public int maxArea(int[] height) {
        int L = 0, R = height.length - 1, res = 0;
        while (L < R) {
            res = height[L] < height[R] ?
                    Math.max(res, (R - L) * height[L++]) :
                    Math.max(res, (R - L) * height[R--]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(new MaxArea().maxArea(nums));
    }
}
