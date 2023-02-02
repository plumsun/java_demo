package com.demo.abstract_factory.demofactory;

import com.demo.abstract_factory.factory.Factory;
import com.demo.abstract_factory.factory.Link;
import com.demo.abstract_factory.factory.Page;
import com.demo.abstract_factory.factory.Tray;

/**
 * @author LiHaoHan
 * @date 2023/2/2
 */
public class DemoFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DemoLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DemoTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DemoPage(title, author);
    }
}
