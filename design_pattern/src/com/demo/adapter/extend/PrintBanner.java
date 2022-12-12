package com.demo.adapter.extend;

/**
 * @author LiHaoHan
 * @date 2022/12/12
 */
public class PrintBanner extends Banner implements Print{


    public PrintBanner(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
