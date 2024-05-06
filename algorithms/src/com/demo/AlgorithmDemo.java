package com.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
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


    /**
     * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
     * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     * 返回容器可以储存的最大水量。
     */
    @Test
    public void maxAreaTest() {
        String str1 = "abc";
        String str2 = "ab";
        String str3 = "abv";
        int num = 0;
        String target = str1.length() > str2.length() ? (str1.length() > str3.length() ? str3 : str1) : (str2.length() > str3.length() ? str3 : str2);
        if (str1.equals(str2) && str1.equals(str3)) {
        }
        if (str1.contains(target)) {
            String tem = str1;
            while (tem.matches(target)) {
                num++;
                tem = tem.substring(tem.indexOf(target), tem.length());
            }
        }
        if (str2.contains(target)) {
            num++;
        }
        if (str3.contains(target)) {
            num++;
        }
    }

    /**
     * 暴力解法，求出每个数字到其他数字所围成的图形面积
     * 再进行比较求出最大值
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while (i < j) {
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]) :
                    Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }

    /**
     * 「HTML 实体解析器」 是一种特殊的解析器，它将 HTML 代码作为输入，并用字符本身替换掉所有这些特殊的字符实体。
     */
    public String entityParser(String text) {
        int l = 0, r = 0;
        StringBuilder sb = new StringBuilder();
        while (r < text.length()) {
            char ch = text.charAt(r++);
            if (ch != '&' && r - l == 1) {
                // 如果当前左右指针中字符不是&，就当前字符添加至目标中，并将左指针向右移动
                sb.append(ch);
                l++;
            } else if (ch == ';' && r - l > 1) {
                // 如果当前左右指针中的字符是以 ;为结尾，就将当前字符截取并判断截取后的字符是否属于字符实体，如果是就替换并添加至目标
                // 无论是或者不是，都要移动左指针到 ;的后一位，
                String s = text.substring(l, r);
                sb.append(map.getOrDefault(s, s));
                l = r;
            } else if (ch == '&' && r - l > 1) {
                // 当前字符是 & 并且，双指针不处于同一位置，也就是 && 相连的情况
                // 将第一个 & 添加到目标中，并将l向右移动至最后一个 & 的后一个位置
                sb.append(text, l, r - 1);
                l = r - 1;
            }
        }
        if (r > l) sb.append(text, l, r);
        return sb.toString();
    }

    static Map<String, String> map = new HashMap<>();

    static {
        map.put("&quot;", "\"");
        map.put("&apos;", "'");
        map.put("&amp;", "&");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");
    }

    @Test
    public void convert() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            // 0 3 -1
            // 1 3 1
            // 2 3 1
            // 1 3 -1
            // 0 3 -1
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) res.append(row);
    }
}

