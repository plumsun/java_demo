package com.动态代理.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * The type Custom intercept.
 *
 * @author LiHaoHan Created on 2023/9/28
 */
public class CustomIntercept implements MethodInterceptor {

    /**
     * @param o           被代理对象
     * @param method      目标方法
     * @param objects     入参
     * @param methodProxy 目标方法调用
     * @return object
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("proxy.method = " + method.getName());
        Object invoked = methodProxy.invokeSuper(o, objects);
        System.out.println("after = " + method.getName());
        return invoked;
    }
}
