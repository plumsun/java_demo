package com.demo;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @date: 2022/2/17 10:27
 * @author: LiHaoHan
 * @program: com.demo
 */
public class VolatileDemo {


    public static void main(String[] args) {
        // visibility();
        atomic();
    }

    /**
     * 1.验证volatile的可见性
     */
    public static void visibility() {
        MyData myData = new MyData();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "线程进入");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "执行完毕，" + myData.num);
            myData.add();
        }, "aa").start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "线程进入");
            while (myData.num == 0) {

            }
            System.out.println(Thread.currentThread().getName() + "知道num修改");
            System.out.println(Thread.currentThread().getName() + "执行完毕，" + myData.num);
        }, "dd").start();
    }

    /**
     * 2.验证volatile不保证原子性
     */
    public static void atomic() {
        MyData myData = new MyData();
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    myData.addPlus();
                }
            }, String.valueOf(i)).start();
        }

        //若是当前线程大于2（main线程和gc线程）
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }

        System.out.println(Thread.currentThread().getName()+"num="+myData.num);


    }
}


class MyData {
    volatile int num = 0;

    public void add() {
        this.num += 60;
    }

    public void addPlus() {
        num++;
    }
}
