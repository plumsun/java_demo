package com.动态代理.cglib;

/**
 * @author LiHaoHan Created on 2023/9/28
 */
public class ProxyTarget {

    public String proxyTest() {
        System.out.println("do something");
        return "null";
    }
}
