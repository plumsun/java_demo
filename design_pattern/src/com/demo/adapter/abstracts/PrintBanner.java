package com.demo.adapter.abstracts;

/**
 * @author LiHaoHan
 * @date 2022/12/12
 */
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String val) {
        this.banner = new Banner(val);
    }

    @Override
    void printWeak() {
        banner.showWithAster();
    }

    @Override
    void printStrong() {
        banner.showWithAster();
    }
}
