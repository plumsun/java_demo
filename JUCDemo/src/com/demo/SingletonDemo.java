package com.demo;

/**
 * @description: 多线程单例模式（DCL机制）
 * @date: 2022/2/18 10:03
 * @author: LiHaoHan
 * @program: com.demo
 */
public class SingletonDemo {

    private volatile static SingletonDemo instance = null;

    private SingletonDemo() {
        System.out.println(Thread.currentThread().getName() + "\t构造方法");
    }


    public static SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    return instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }


    public static void main(String[] args) {
        // System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
        // System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
        // System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
        // System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
        //
        //
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();


        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                SingletonDemo.getInstance();
            }, String.valueOf(i)).start();
        }


    }
}
