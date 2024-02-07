package com.rongwen.top100.slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    /**
     * 3. 无重复字符的最长子串
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int res = 0, rk = -1;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) set.remove(s.charAt(i - 1));
            while (rk + 1 < s.length() && !set.contains(s.charAt(rk + 1))) {
                set.add(s.charAt(rk + 1));
                rk++;
            }
            res = Math.max(res, rk - i + 1);
        }
        return res;
    }
}
