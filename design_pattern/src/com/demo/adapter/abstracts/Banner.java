package com.demo.adapter.abstracts;

/**
 * @author LiHaoHan
 * @date 2022/12/12
 */
public class Banner {

    private String str;

    public Banner(String str) {
        this.str = str;
    }

    void showWithParen(){
        System.out.println("str-Paren = " + str);
    }
    void showWithAster(){
        System.out.println("str-Aster = " + str);
    }
}
