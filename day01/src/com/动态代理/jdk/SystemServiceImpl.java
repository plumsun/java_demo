package com.动态代理.jdk;

/**
 * @author LiHaoHan Created on 2023/9/28
 */
public class SystemServiceImpl implements SystemService{
    @Override
    public String proxyTest() {
        System.out.println("do something");
        return "s";
    }
}
