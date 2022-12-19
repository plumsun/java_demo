package com.demo.singleton;

/**
 * @author LiHaoHan
 * @date 2022/12/19
 */
public class SingletonTest1 {

    /**
     * 饿汉模式的单例
     * 不管是否使用都会提前创建对象
     */

    private static SingletonTest1 singleton = new SingletonTest1();

    private SingletonTest1() {
    }

    public static SingletonTest1 getInstance(){
        return singleton;
    }
}
