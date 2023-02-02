package com.demo.abstract_factory;

import com.demo.abstract_factory.factory.Factory;
import com.demo.abstract_factory.factory.Link;
import com.demo.abstract_factory.factory.Page;
import com.demo.abstract_factory.factory.Tray;

/**
 * @author LiHaoHan
 * @date 2023/2/2
 */
public class Demo {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("com.demo.abstract_factory.demofactory.DemoFactory");
        Link link1 = factory.createLink("caption1", "url1");
        Link link2 = factory.createLink("caption2", "url2");
        Link link3 = factory.createLink("caption3", "url3");

        Tray tray = factory.createTray("caption");
        tray.add(link1);
        tray.add(link2);
        tray.add(link3);

        Page page = factory.createPage("title", "name");
        page.add(tray);
        String outPut = page.outPut();
        System.out.println("outPut = " + outPut);
    }
}
