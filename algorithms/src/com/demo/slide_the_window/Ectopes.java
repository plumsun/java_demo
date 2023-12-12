package com.demo.slide_the_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author LiHaoHan Created on 2023/12/12
 */
public class Ectopes {

    public static void main(String[] args) {
        List<Integer> anagrams = findAnagrams1("cbaebabacd", "abc");
        System.out.println("anagrams = " + anagrams);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> integers = new ArrayList<>();
        int length = p.length();
        if (p.length() > s.length() || s.length() == 0 || length == 0) {
            return integers;
        }
        char[] chars1 = p.toCharArray();
        Arrays.sort(chars1);
        String string = Arrays.toString(chars1);
        char[] chars;
        for (int i = 0; i <= s.length() - length; i++) {
            int right = i + length;
            chars = s.substring(i, right).toCharArray();
            Arrays.sort(chars);
            if (string.equals(Arrays.toString(chars))) {
                integers.add(i);
            }
        }
        return integers;
    }

    public static List<Integer> findAnagrams1(String s, String p) {
        ArrayList<Integer> integers = new ArrayList<>();
        int n = s.length(), m = p.length();
        int[] c1 = new int[26], c2 = new int[26];
        for (int i = 0; i < m; i++) c2[p.charAt(i) - 'a']++;
        for (int l = 0, r = 0; r < n; r++) {
            c1[s.charAt(r) - 'a']++;
            if (r - l + 1 > m) c1[s.charAt(l++) - 'a']--;
            if (check(c1, c2)) integers.add(l);
        }
        return integers;
    }

    static boolean check(int[] c1, int[] c2) {
        for (int i = 0; i < 26; i++) {
            if (c1[i] != c2[i]) return false;
        }
        return true;
    }

    public static List<Integer> findAnagrams3(String s, String p) {
        int sLen = s.length(), pLen = p.length();

        if (sLen < pLen) {
            return new ArrayList<>();
        }

        List<Integer> ans = new ArrayList<>();
        int[] count = new int[26];
        for (int i = 0; i < pLen; ++i) {
            ++count[s.charAt(i) - 'a'];
            --count[p.charAt(i) - 'a'];
        }

        int differ = 0;
        for (int j = 0; j < 26; ++j) {
            if (count[j] != 0) {
                ++differ;
            }
        }

        if (differ == 0) {
            ans.add(0);
        }

        for (int i = 0; i < sLen - pLen; ++i) {
            if (count[s.charAt(i) - 'a'] == 1) {
                --differ;
            } else if (count[s.charAt(i) - 'a'] == 0) {
                ++differ;
            }
            --count[s.charAt(i) - 'a'];

            if (count[s.charAt(i + pLen) - 'a'] == -1) {
                --differ;
            } else if (count[s.charAt(i + pLen) - 'a'] == 0) {
                ++differ;
            }
            ++count[s.charAt(i + pLen) - 'a'];

            if (differ == 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

}
