package com.threadDemo;

import java.util.concurrent.Callable;

import java.util.ArrayList;
import java.util.Date;

/**
 * @description: 死锁演示与排查
 * @date: 2022/5/27 11:39
 * @author: LiHaoHan
 * @program: com.threadDemo
 */
public class DeadLockDemo {

    public static void main(String[] args) {


    }
    private static void extracted() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        if(list.size() == 1){
            if(!list.get(0).contains("1")){
                System.out.println(" = 1");
            }
        }else if(list.size() != 0){
            System.out.println("= 0");
        }
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