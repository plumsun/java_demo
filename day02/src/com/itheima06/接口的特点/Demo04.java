package com.itheima06.接口的特点;

public class Demo04 {

    public static void main(String[] args) {

    }
}
//抽象类
abstract class Dog{
    public abstract void eat();
    public abstract void run();
}
//接口
interface Functional{
    void guide();
}
//GuideGog is a Dog, have a guide function.
class GuideGog extends Dog implements Functional{
    @Override
    public void eat() {

    }

    @Override
    public void run() {

    }

    @Override
    public void guide() {

    }
}