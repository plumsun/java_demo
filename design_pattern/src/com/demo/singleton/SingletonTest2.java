package com.demo.singleton;

/**
 * @author LiHaoHan
 * @date 2022/12/19
 */
public class SingletonTest2 {
    /**
     * 懒汉模式的单例
     * 使用时才会创建对象
     */
    private static SingletonTest2 singleton;

    private SingletonTest2(){

    }

    public static SingletonTest2 getInstance() {
        if(singleton == null){
            singleton = new SingletonTest2();
        }
        return singleton;
    }
}
