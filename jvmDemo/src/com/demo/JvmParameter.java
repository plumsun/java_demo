package com.demo;

/**
 * @description:
 * @date: 2022/6/18 11:54
 * @author: LiHaoHan
 * @program: com.demo
 */
public class JvmParameter {


    /**
     * 查询jvm参数
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        /*
            查询java程序的默认jvm参数   ---jinfo命令
            jinfo -flag PrintGCDetails 11404 查询gc日志参数是否开启

         */
        System.out.println("start.....");
        // Thread.sleep(Integer.MAX_VALUE);
    }
}
