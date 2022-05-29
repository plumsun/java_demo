package com.itheima10.模板设计模式;

public class Demo01 {

    public static void main(String[] args) {

        ADriver ad = new ADriver();
        //ad调用drive方法的时候, this=ad
        // ADriver重写了style,this优先调用子类的style方法
        ad.drive();

        new BDriver().drive();
    }
}
