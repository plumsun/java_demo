package com.demo.singleton;

/**
 * 静态内部类（推荐）
 *
 * @author LiHaoHan
 * @date 2022/12/19
 */
public class SingletonStatic {

    private SingletonStatic(){}

    private static final class SingletonHolder {
        static final SingletonStatic SINGLETON = new SingletonStatic();
    }

    public static SingletonStatic getInstance() {
        return SingletonHolder.SINGLETON;
    }
}
