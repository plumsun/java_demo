package com.demo.adapter.abstracts;

/**
 * source
 *
 * @author LiHaoHan
 * @date 2022/12/12
 */
public class Banner {

    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public void showWithParen(){
        System.out.println("str-Paren = " + str);
    }
    public void showWithAster(){
        System.out.println("str-Aster = " + str);
    }
}
