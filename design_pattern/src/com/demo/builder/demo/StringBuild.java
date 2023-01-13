package com.demo.builder.demo;

/**
 * 具体的构建者
 * @author LiHaoHan
 * @date 2023/1/4
 */
public class StringBuild extends Builder {

    @Override
    protected void initBuild() {
        System.out.println("String init");
    }

    @Override
    protected void buildAfter() {
        System.out.println("String process");
    }

    @Override
    protected void buildClose() {
        System.out.println("String close");
    }
}
