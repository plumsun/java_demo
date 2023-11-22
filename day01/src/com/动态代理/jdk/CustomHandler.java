package com.动态代理.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author LiHaoHan Created on 2023/9/28
 */
public class CustomHandler implements InvocationHandler {

    /**
     * @param proxy  被代理类
     * @param method 被代理目标方法
     * @param args   入参
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy.method = " + method.getName());
        Object invoke = method.invoke(proxy, args);
        System.out.println("invoke = " + invoke);
        return invoke;
    }
}
