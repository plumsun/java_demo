package com.demo.abstract_factory.factory;

import java.util.ArrayList;

/**
 * 抽象产品
 *
 * @author LiHaoHan
 * @date 2023/2/2
 */
public abstract class Page {

    //题目
    protected String title;
    //作者
    protected String author;
    //
    protected ArrayList<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public String outPut() {
        String filename = title;
        System.out.println("输出" + filename);
        return this.makeHtml();
    }

    public abstract String makeHtml();

}
