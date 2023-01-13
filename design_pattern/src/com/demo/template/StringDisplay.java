package com.demo.template;


/**
 * @author LiHaoHan
 * @date 2022/12/15
 */
public class StringDisplay extends AbstractDisplay {
    @Override
    void open() {
        System.out.println("string open()");
    }

    @Override
    void print() {
        System.out.println("string print()");
    }

    @Override
    void close() {
        System.out.println("string close()");
    }
}
