package com.demo.abstract_factory.demofactory;

import com.demo.abstract_factory.factory.Item;
import com.demo.abstract_factory.factory.Page;

/**
 * @author LiHaoHan
 * @date 2023/2/2
 */
public class DemoPage extends Page {

    public DemoPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuilder build = new StringBuilder();
        content.stream().map(Item::toString).forEach(build::append);
        return build.toString();
    }
}
