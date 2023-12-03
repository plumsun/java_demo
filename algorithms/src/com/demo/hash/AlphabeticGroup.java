package com.demo.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author LiHaoHan Created on 2023/12/1
 */
public class AlphabeticGroup {
    public static void main(String[] args) {
        String str = "abc";
        List<String> res = res(str);
        System.out.println("res = " + res);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        return null;
    }

    private static List<String> res(String str) {
        ArrayList<String> list = new ArrayList<>();
        list.add(str);
        int num = (str.length() - 1) * str.length();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder();
            map.clear();
            sb.append(str.charAt(i));
            map.put(String.valueOf(str.charAt(i)), i);
            int j = i+1;
            while (num != 0) {
                if (j >= str.length()) {
                    j = 0;
                }
                if (!map.containsValue(j)) {
                    map.put(String.valueOf(str.charAt(j)), j);
                    sb.append(str.charAt(j));
                    num--;
                }
                if (sb.length() == str.length()) {
                    map.clear();
                    j = i+2;
                    map.put(String.valueOf(str.charAt(i)), i);
                    String string = sb.toString();
                    if (!list.contains(string)) {
                        list.add(string);
                    }
                    sb.delete(1, str.length());
                }
                j++;
            }
            num = (str.length() - 1) * str.length();

        }
        return list;
    }
}
