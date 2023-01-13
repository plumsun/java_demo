package com.demo.builder.demo;

/**
 * 具体的构建者
 * @author LiHaoHan
 * @date 2023/1/4
 */

public class IntegerBuild extends Builder {

    @Override
    protected void initBuild() {
        System.out.println("Integer init");
    }

    @Override
    protected void buildAfter() {
        System.out.println("Integer process");
    }

    @Override
    protected void buildClose() {
        System.out.println("Integer close");
    }
}
