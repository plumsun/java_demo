package com.demo.template;

/**
 * @author LiHaoHan
 * @date 2022/12/15
 */
public class CharDisplay extends AbstractDisplay{
    @Override
    void open() {
        System.out.println("char open()");
    }

    @Override
    void print() {
        System.out.println("char print()");
    }

    @Override
    void close() {
        System.out.println("char close()");
    }
}
