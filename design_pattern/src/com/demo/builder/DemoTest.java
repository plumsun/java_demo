package com.demo.builder;

import org.junit.Test;

/**
 * @author LiHaoHan
 * @date 2023/1/4
 */
public class DemoTest {

    @Test
    public void test(){
        Director director1 = new Director(new StringBuild());
        director1.construct();
        Director director2 = new Director(new IntegerBuild());
        director2.construct();
    }
}
