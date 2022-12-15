package com.demo.adapter.abstracts;

/**
 * adapter
 *
 * @author LiHaoHan
 * @date 2022/12/12
 */
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String val) {
        this.banner = new Banner(val);
    }

    @Override
    public void printWeak() {
        banner.showWithAster();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
