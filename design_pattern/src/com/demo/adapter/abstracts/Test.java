package com.demo.adapter.abstracts;


/**
 * @author LiHaoHan
 * @date 2022/12/12
 */
public class Test {
    /**
     * 适配器模式（adapter,wrapper）
     * 通过委托（抽象类）实现
     *
     * 通过接口或者类将指定实体类进行包装，在这个类的基础上加以修饰，使其能狗用于其他用途。
     * 这个起包装作用的接口或者类被称为包装类或者适配器
     *
     * @param args
     */
    public static void main(String[] args) {
        Print print = new PrintBanner("a");
        print.printStrong();
        print.printWeak();
    }
}
