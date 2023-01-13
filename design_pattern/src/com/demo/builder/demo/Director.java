package com.demo.builder.demo;

/**
 * 监工
 *
 * @author LiHaoHan
 * @date 2023/1/4
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.init();
        builder.process();
        builder.close();
    }
}
