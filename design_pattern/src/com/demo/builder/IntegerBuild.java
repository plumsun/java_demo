package com.demo.builder;

/**
 * @author LiHaoHan
 * @date 2023/1/4
 */
public class IntegerBuild implements Builder{
    @Override
    public void process1() {
        System.out.println("Integer 1");
    }

    @Override
    public void process2() {
        System.out.println("Integer 2");
    }

    @Override
    public void process3() {
        System.out.println("Integer 3");
    }

    @Override
    public void process4() {
        System.out.println("Integer 4");
    }

    @Override
    public void process5() {
        System.out.println("Integer 5");
    }

    @Override
    public void close() {
        System.out.println("Integer close");
    }
}
