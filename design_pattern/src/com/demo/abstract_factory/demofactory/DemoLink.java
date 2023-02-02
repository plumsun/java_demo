package com.demo.abstract_factory.demofactory;

import com.demo.abstract_factory.factory.Link;

/**
 * @author LiHaoHan
 * @date 2023/2/2
 */
public class DemoLink extends Link {
    public DemoLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "link";
    }
}
