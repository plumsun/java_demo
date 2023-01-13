package com.demo.builder;

import org.junit.Test;

/**
 * @author LiHaoHan
 * @date 2023/1/4
 */
public class DemoTest {

    @Test
    public void test() {
        Director director1 = new Director(new StringBuild());
        director1.construct();
        Director director2 = new Director(new IntegerBuild());
        director2.construct();
    }

    /**
     * build和Template模式结合
     */
    @Test
    public void buildAndTemplate() {
        com.demo.builder.demo.Director director = new com.demo.builder.demo.Director(new com.demo.builder.demo.IntegerBuild());
        director.construct();
        com.demo.builder.demo.Director director1 = new com.demo.builder.demo.Director(new com.demo.builder.demo.StringBuild());
        director1.construct();
    }
}
