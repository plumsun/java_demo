package com.threadDemo;

import java.util.concurrent.*;

/**
 * @description: 自定义线程池使用
 * @date: 2022/5/27 10:37
 * @author: LiHaoHan
 * @program: com.threadDemo
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        /**
         * jdk提供的线程池,底层的任务队列最大值为int的最大值，在池中线程不足时会出现oom（内存溢出）
         */
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        /*
        项目中使用线程池都是自定义的，通过ThreadPoolExecutor类

           a. 线程池的最大容量值的设置：
                1.CPU密集型(计算业务比较多)
                    CPU核心数+1
                2.io密集型(进行数据库操作)
                    CPU核心数*2
                    cpu核心数/1-阻塞系数     阻塞系数0.8~0.9


           b. 拒绝策略：RejectedExecutionHandler
                1.第一种AbortPolicy:不执行新任务，直接抛出异常，提示线程池已满
                2.第二种DisCardPolicy:不执行新任务，也不抛出异常
                3.第三种DisCardOldSetPolicy:将任务队列中的第一个任务替换为当前新进来的任务执行
                4.第四种CallerRunsPolicy:直接调用execute来执行当前任务
         */
        int cpus = Runtime.getRuntime().availableProcessors();//获取当前CPU核心数
        System.out.println("cpus = " + cpus);

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                5,
                5,
                5L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        try {
            for (int i = 0; i <=11; i++) {
                threadPool.execute(() -> {
                    System.out.println("当前线程= " + Thread.currentThread().getName());
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}
