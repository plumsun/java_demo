package com.demo.utils;

import java.util.Arrays;

/**
 * @author LiHaoHan
 * @date 2023/1/3
 */
public class StringUtils {

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
}
