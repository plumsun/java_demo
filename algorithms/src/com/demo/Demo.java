package com.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @date: 2022/5/1 13:49
 * @author: LiHaoHan
 * @program: com.demo
 */
public class Demo {
    public static void main(String[] args) {
        String str = ">><<sssssssss><sssss><s><<<<sssss>>sss>>ss><sss>";
        int start = str.indexOf('<');
        int end = start;
        HashMap<Integer,String> integers = new HashMap<>();
        for (int i = start; i < str.length() - 1; i++) {
            if (str.charAt(i) == '>') {
                integers.put(i - start - 1,start+","+i);
                start = str.indexOf('<', end + 1);
                end = start;
                i = end;
            }
        }
        Map.Entry<Integer, String> integerStringEntry = integers.entrySet().stream().min(Map.Entry.comparingByKey()).orElse(null);
        System.out.println("integer = " + integerStringEntry);
    }
}
