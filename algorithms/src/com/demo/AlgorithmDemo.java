package com.demo;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author LiHaoHan
 * @date 2022/12/12
 */
public class AlgorithmDemo {

    /**
     * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     * 两数之和
     */
    @Test
    public void test1() {
        twoSum(null, 0);
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0};
    }


    /**
     * 括号匹配深度
     */
    @Test
    public void test() {
        int i = bracketNum("((()))");
        System.out.println("i = " + i);
    }

    private int bracketNum(String str) {
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
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度
     *
     * @param s
     * @return
     */
    @Test
    public void lengthOf() {
        int i = lengthOfLongestSubstring("pwwkew");
        System.out.println("i = " + i);
    }


    public int lengthOfLongestSubstring(String s) {
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

    /**
     * 寻找两个正序数组的中位数
     */
    @Test
    public void findMedian() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        double d = findMedianSortedArrays(nums1, nums2);
        System.out.println("d = " + d);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).boxed().sorted().collect(Collectors.toList());
        int size = list.size();
        int index = (size / 2);
        double integer = list.get(index).doubleValue();
        if (size % 2 == 0) {
            integer = (list.get(index - 1).doubleValue() + integer) / 2;
        }
        return integer;
    }

    /**
     * 给你一个字符串 s，找到 s 中最长的回文子串。
     * <p>
     * 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
     */
    @Test
    public void longestPalindrome() {
    }

    /**
     * 给你一个字符串s和一个字符规律p，请你来实现一个支持 '.'和'*'的正则表达式匹配。
     * <p>
     * '.' 匹配任意单个字符
     * '*' 匹配零个或多个前面的那一个元素
     */
    @Test
    public void isMatch() {
        String s = "cab";
        String s1 = "ab";
        System.out.println(Arrays.toString(s.split("c")));
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
        }
    }

    public boolean isMatch(String s, String p) {
        boolean flag = false;
        final String all = "*";
        final String part = ".";
        HashMap<Integer, String> map = new HashMap<>();
        if (!p.contains(all) || !p.contains(part)) {
            return flag;
        }
        int index = p.indexOf(part);
        String[] split = p.split("");
        StringBuilder builder1 = new StringBuilder(s);
        StringBuilder builder2 = new StringBuilder(p);
        if (index != -1) {
            for (int i = 0; i < split.length; i++) {
                if (part.equals(split[i])) {
                    builder1.deleteCharAt(i);
                    builder2.deleteCharAt(i);
                }
                if (all.equals(split[i])) {
                    builder2.deleteCharAt(i);
                    map.put(i, all);
                }
            }

        }
        Set<Integer> set = map.keySet();
        int size = set.size();
        if (size == 0) {
            return builder1.toString().equals(builder2.toString());
        }
        set.forEach(i -> {
                    if (i == p.length() - 1 && size == 1) {
                        builder1.toString().startsWith(builder2.toString());
                    }
                    if (i == 0 && size == 1) {
                        builder1.toString().endsWith(builder2.toString());
                    }
                    if (i < p.length() - 1 && i > 0) {
                        String[] strings = builder2.toString().split("");

                    }
                }
        );
        return flag;
    }

    @Test
    public void isValid() {
        boolean valid = isValid("(){}");
        System.out.println("valid = " + valid);
    }

    public boolean isValid(String s) {
        if (s.isEmpty())
            return true;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.empty() || c != stack.pop())
                return false;
        }
        return stack.empty();
    }

    /**
     * 最长回文子串
     * 给你一个字符串 s，找到 s 中最长的回文子串。
     * 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
     * 条件：
     * 1、字符串反序与原始字符串相同
     * 2、字符串长度最长
     */
    @Test
    public void longestPalindromeTest() {
        String bbaab = longestPalindrome("baaaavab");
        System.out.println(bbaab);
    }


    public String longestPalindrome(String s) {
        String num = "";
        int length = s.length();
        int left;
        int right;
        for (int i = 0; i < length; i++) {
            // 针对给定字符长度为偶数的情况
            left = i;
            right = i + 1;
            String num1 = getNum(s, length, left, right);

            // 针对给定字符长度为奇数的情况
            right = i;
            String num2 = getNum(s, length, left, right);
            String num3 = num1.length() > num2.length() ? num1 : num2;
            num = num3.length() > num.length() ? num3 : num;
        }
        return num;
    }

    private static String getNum(String s, int length, int left, int right) {
        String str = "";
        while (left >= 0 && right <= length - 1 && (s.charAt(left) == (s.charAt(right)))) {
            String substring = s.substring(left, right + 1);
            str = substring.length() > str.length() ? substring : str;
            --left;
            ++right;
        }
        return str;
    }

    /**
     * 动态规划算法
     * 1、将整体任务进行拆分，分为一个个小的任务，每个小任务的计算依赖于上一个任务的结果
     * 2、通过填表的方式可视化小任务的结果，并推出规律
     *
     * @param s
     * @return
     */


    /**
     * 回文子串
     * 给你一个字符串 s ，请你统计并返回这个字符串中 回文子串 的数目。
     * 回文字符串 是正着读和倒过来读一样的字符串。
     * 子字符串 是字符串中的由连续字符组成的一个序列。
     * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
     */
    @Test
    public void countSubstringsTest() {
        int num = countSubstrings("baaaavab");
        System.out.println(num);
    }

    public int countSubstrings(String s) {
        int num = 0;
        int length = s.length();
        int left;
        int right;
        for (int i = 0; i < length; i++) {
            // 针对给定字符长度为偶数的情况
            left = i;
            right = i + 1;
            num = getNum(s, num, length, left, right);

            // 针对给定字符长度为奇数的情况
            right = i;
            num = getNum(s, num, length, left, right);
        }
        return num;
    }

    private static int getNum(String s, int num, int length, int left, int right) {
        while (left >= 0 && right <= length - 1 && (s.charAt(left) == (s.charAt(right)))) {
            --left;
            ++right;
            ++num;
        }
        return num;
    }
}

