package com.demo.abstract_factory.factory;

/**
 * 抽象属性
 *
 * @author LiHaoHan
 * @date 2023/2/2
 */
public abstract class Item {

    //标题
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    /**
     * 装载产品
     *
     * @return
     */
    public abstract String makeHTML();
}
