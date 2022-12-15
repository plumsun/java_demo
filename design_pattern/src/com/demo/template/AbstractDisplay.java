package com.demo.template;

/**
 * @author LiHaoHan
 * @date 2022/12/15
 */
public abstract class AbstractDisplay {

    abstract void open();

    abstract void print();

    abstract void close();

    final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
