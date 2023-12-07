package com.demo.slide_the_window;

import java.util.HashMap;

/**
 * @author LiHaoHan Created on 2023/12/7
 */
public class NoDuplicateSubstrings {

    public static void main(String[] args) {
        int i = lengthOfLongestSubstring("pwwkew");
        System.out.println("i = " + i);
    }

    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     * <p>
     * 示例 1:
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * <p>
     * 示例 2:
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * <p>
     * 示例 3:
     * 输入: s = "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     */
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int len = 0;
        int right = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (map.containsKey(String.valueOf(aChar))) {
                right = Math.max(right, map.get(String.valueOf(aChar)) + 1);
            }
            map.put(String.valueOf(aChar), i);
            len = Math.max(len, i - right + 1);
        }
        return len;
    }
}
