package com.demo;

/**
 * @description:
 * @date: 2022/6/18 12:41
 * @author: LiHaoHan
 * @program: com.demo
 */
public class UsedParameter {
    public static void main(String[] args) {
        //jvm的内存总量 -Xms 默认当前机器总内存的1/64
        long memory = Runtime.getRuntime().totalMemory();
        //jvm的最大内存 -Xmx 默认当前机器总内存的1/4
        long maxMemory = Runtime.getRuntime().maxMemory();
        // long directMemory = VM.maxDirectMemory();
        // System.out.println("directMemory = " + directMemory);
        System.out.println("memory = " + memory);
        System.out.println("maxMemory = " + maxMemory);
    }
}
