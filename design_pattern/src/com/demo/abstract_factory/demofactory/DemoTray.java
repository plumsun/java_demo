package com.demo.abstract_factory.demofactory;

import com.demo.abstract_factory.factory.Item;
import com.demo.abstract_factory.factory.Tray;

/**
 * @author LiHaoHan
 * @date 2023/2/2
 */
public class DemoTray extends Tray {
    public DemoTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder build = new StringBuilder();
        tray.stream().map(Item::toString).forEach(build::append);
        return build.toString();
    }
}
