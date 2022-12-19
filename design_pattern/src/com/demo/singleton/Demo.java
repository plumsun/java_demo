package com.demo.singleton;

import org.junit.Test;

/**
 * @author LiHaoHan
 * @date 2022/12/19
 */
public class Demo {
    @Test
    public void singletonTest1(){
        for (int i = 0; i < 5; i++) {
            System.out.println(SingletonTest1.getInstance());
        }
    }

    @Test
    public void singletonTest2(){
        for (int i = 0; i < 5; i++) {
            System.out.println(SingletonTest2.getInstance());
        }
    }

    @Test
    public void singletonStatic(){
        for (int i = 0; i < 5; i++) {
            System.out.println(SingletonStatic.getInstance());
        }
    }

    @Test
    public void singletonLock(){
        for (int i = 0; i < 5; i++) {
            System.out.println(SingletonLock.getInstance());
        }
    }

    @Test
    public void demoSingleton(){
        for (int i = 0; i < 5; i++) {
            System.out.println(DemoSingleton.getInstance());
        }
    }

    @Test
    public void singleton(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Singleton.SINGLETON);
        }
    }
}
