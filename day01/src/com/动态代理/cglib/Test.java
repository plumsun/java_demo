package com.动态代理.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * CGLIB动态代理demo
 *
 * @author LiHaoHan Created on 2023/9/28
 */
public class Test {

    public static void main(String[] args) {
        ProxyTarget target = (ProxyTarget) Enhancer.create(ProxyTarget.class, new CustomIntercept());
        target.proxyTest();
    }
}
