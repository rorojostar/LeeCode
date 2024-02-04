package com.rongwen.top100.hash;

import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutive {
    /**
     * middle
     * 128. 最长连续序列
     * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
     * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
     * 输入：nums = [100,4,200,1,3,2]
     * 输出：4
     * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
     */


    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num :
                nums) {
            set.add(num);
        }
        int longStreak = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longStreak = Math.max(longStreak, currentStreak);
            }

        }
        return longStreak;
    }

}
