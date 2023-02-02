package com.demo.abstract_factory.factory;

import java.util.ArrayList;

/**
 * 抽象零件
 *
 * @author LiHaoHan
 * @date 2023/2/2
 */
public abstract class Tray extends Item {

    /**
     * 产品集合
     */
    protected ArrayList<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    /**
     * 添加属性
     *
     * @param item
     */
    public void add(Item item) {
        tray.add(item);
    }
}
