package com.demo.builder;

/**
 * @author LiHaoHan
 * @date 2023/1/4
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.process1();
        builder.process2();
        builder.process3();
        builder.process4();
        builder.process5();
        builder.close();
    }
}
