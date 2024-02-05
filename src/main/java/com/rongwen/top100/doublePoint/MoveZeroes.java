package com.rongwen.top100.doublePoint;

import com.rongwen.utils.Utils;

import java.util.Arrays;

public class MoveZeroes {

    /**
     * 283. 移动零
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
     * 输入: nums = [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     *
     * @param nums
     */

    public int[] moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                Utils.swap(nums, slow, fast);
                slow++;
            }
            fast++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(new MoveZeroes().moveZeroes(nums)));
    }

}
