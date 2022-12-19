package com.demo.singleton;

/**
 * 双重检锁 DCL
 * @author LiHaoHan
 * @date 2022/12/19
 */
public class SingletonLock {
    private volatile static SingletonLock singleton;

    private SingletonLock(){}

    public static SingletonLock getInstance(){
        if(singleton == null){
            synchronized (SingletonLock.class){
                if(singleton == null){
                    singleton = new SingletonLock();
                }
            }
        }
        return singleton;
    }

}
