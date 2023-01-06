package com.demo.builder;

/**
 * @author LiHaoHan
 * @date 2023/1/4
 */
public class StringBuild implements Builder{
    @Override
    public void process1() {
        System.out.println("String 1");
    }

    @Override
    public void process2() {
        System.out.println("String 2");
    }

    @Override
    public void process3() {
        System.out.println("String 3");
    }

    @Override
    public void process4() {
        System.out.println("String 4");
    }

    @Override
    public void process5() {
        System.out.println("String 5");
    }

    @Override
    public void close() {
        System.out.println("String close");
    }
}
