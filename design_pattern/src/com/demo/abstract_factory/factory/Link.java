package com.demo.abstract_factory.factory;

/**
 * 抽象零件
 *
 * @author LiHaoHan
 * @date 2023/2/2
 */
public abstract class Link extends Item{

    protected String url;

    public Link(String caption,String url) {
        super(caption);
        this.url = url;
    }
}
