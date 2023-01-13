package com.demo.template;

/**
 * Template
 *
 * @author LiHaoHan
 * @date 2022/12/15
 */
public abstract class AbstractDisplay {

    /**
     * 初始化
     */
    abstract void open();

    /**
     * 业务处理
     */
    abstract void print();

    /**
     * 资源关闭
     */
    abstract void close();

    /**
     * 定义规则
     */
    final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
