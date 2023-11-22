package com.动态代理.jdk;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理demo
 *
 * @author LiHaoHan Created on 2023/9/28
 */
public class Test {

    public static void main(String[] args) {
        SystemServiceImpl service = new SystemServiceImpl();
        SystemService systemService = (SystemService) Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                new CustomHandler());
        systemService.proxyTest();
    }
}
