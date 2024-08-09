package com.threadDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @program: Stream
 * @Date: 2022/10/18
 * @Author: LiHaoHan
 * @Description:
 */
public class ThreadTest {


    @org.junit.Test
    public void workThreadTest() throws InterruptedException {
        ExecutorService pool = Executors.newWorkStealingPool(3);
        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            pool.submit(() -> {
                System.out.println("Task " + taskNumber + " executed by " + Thread.currentThread().getName());
                try {
                    // 模拟任务耗时
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        // 等待所有任务完成
        pool.shutdown();
        System.out.println("pool = " + pool + System.currentTimeMillis());
        // 判断线程池中所有任务是否在指定时间范围内完成
        boolean b = pool.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("pool = " + b);
    }
}
