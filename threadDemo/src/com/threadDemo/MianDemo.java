package com.threadDemo;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @description:
 * @date: 2022/7/13 20:12
 * @author: LiHaoHan
 * @program: com.threadDemo
 */
public class MianDemo {
    public static void main(String[] args) {
        String [] demo =new String[] {"132345","13245","132645","1325485"};
        String str = Arrays.stream(demo).max(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        }).get();
        
        for (String s : demo) {
            if (str.length() > s.length()) {
                str = s;
            }
        }
        char[] chars = str.toCharArray();
        String [] tt =new String[str.length()];
        for (int i = 0; i < chars.length; i++) {
            tt[i] = ""+chars[i];
        }
        String tmp = "";
        String first="";
        Boolean flag=true;
        for (String data : tt) {
            if (flag) {
                first=tmp;
                tmp += data;
            }
            for (String s : demo) {
                if (!s.startsWith(tmp)) {
                    flag=false;
                    break;
                }
            }
            if(!flag){
                 break;
            }
        }
        System.out.println("first = " + first);
    }
}
