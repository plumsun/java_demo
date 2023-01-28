package com.demo.utils;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author LiHaoHan
 * @date 2023/1/3
 */
public class StringUtils {

    private StringUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * 求括号深度
     *
     * @param str
     * @return
     */
    public static int bracketNum(String str) {
        int num = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                num++;
            else
                num--;
            count = Math.max(num, count);
        }
        return count;
    }

    /**
     * 前缀
     *
     * @param demo
     * @return
     */
    public static String prefix(String [] demo){
        Arrays.sort(demo);
        StringBuilder builder = new StringBuilder();
        int len = demo.length - 1;
        int start = demo[0].length();
        int end = demo[len].length();
        int count = Math.min(start, end);
        for (int i = 0; i < count; i++) {
            if (demo[0].charAt(i)==demo[len].charAt(i)){
                builder.append(demo[0].charAt(i));
            }
        }
        return builder.toString();
    }

    /**
     * 不含有重复字符的 最长子串 的长度
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            if (map.containsKey(str)) {
                end = Math.max(end, map.get(str) + 1);
            }
            map.put(str, i);
            start = Math.max(start, i - end + 1);
        }
        return start;
    }
}
