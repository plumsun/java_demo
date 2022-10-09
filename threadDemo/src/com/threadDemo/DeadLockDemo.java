package com.threadDemo;

import java.util.concurrent.Callable;

/**
 * @description: 死锁演示与排查
 * @date: 2022/5/27 11:39
 * @author: LiHaoHan
 * @program: com.threadDemo
 */
public class DeadLockDemo {

    public static void main(String[] args) {

    }


}
class ThreadTest implements Runnable{
    @Override
    public void run() {

    }
}
class ThreadTest1 implements Callable<Object>{
    @Override
    public Object call() throws Exception {
        return null;
    }
}
class ThreadDemo extends Thread{
    @Override
    public void run() {
        super.run();
    }
}