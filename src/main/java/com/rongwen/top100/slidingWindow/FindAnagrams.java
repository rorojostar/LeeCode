package com.rongwen.top100.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {

    /**
     * 438. 找到字符串中所有字母异位词
     * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
     * 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
     * <p>
     * 输入: s = "cbaebabacd", p = "abc"
     * 输出: [0,6]
     * 解释:
     * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
     * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
     *
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        int sLen = s.length(), pLen = p.length();
        if (s == null || p == null || sLen < pLen) return res;

        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < pLen; i++) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }

        if (Arrays.equals(sCount, pCount)) {
            res.add(0);
        }

        for (int i = 0; i < sLen - pLen; i++) {
            sCount[s.charAt(i) - 'a']--;
            sCount[s.charAt(i + pLen) - 'a']++;

            if (Arrays.equals(sCount, pCount)) {
                res.add(i + 1);
            }
        }

        return res;
    }
}
