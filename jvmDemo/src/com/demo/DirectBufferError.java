package com.demo;

import java.nio.ByteBuffer;

/**
 * @description:
 * @date: 2022/6/18 20:51
 * @author: LiHaoHan
 * @program: com.demo
 */
public class DirectBufferError {

    public static void main(String[] args) {
        /*
            java.lang.OutOfMemoryError: Direct buffer memory
            nio分配堆外内存，内存不足导致程序崩溃
         */
        long maxMemory = Runtime.getRuntime().maxMemory();
        ByteBuffer direct = ByteBuffer.allocateDirect(6 * 1024 * 1024);
    }
}
