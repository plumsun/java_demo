package com.demo;

import java.util.ArrayList;

/**
 * @description:
 * @date: 2022/6/18 20:31
 * @author: LiHaoHan
 * @program: com.demo
 */
public class GCOverHeadError {
    public static void main(String[] args) {
        /*
            gc回收时间过长
         */
        int i = 0;
        ArrayList<String> list = new ArrayList<>();
        while (true){
            list.add(String.valueOf(i).intern());
        }
    }
}
