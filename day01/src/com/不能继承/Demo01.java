package com.不能继承;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo01 {

    public static void main(String[] args) throws ClassNotFoundException {
        B b = new B();
        b.setName("张三");
        test(b);
        System.out.println("b = " + b.getName());
        Class<? extends B> aClass = b.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        Constructor<?>[] constructors = aClass.getConstructors();
        Field[] declaredFields = aClass.getDeclaredFields();
        boolean annotation = aClass.isAnnotation();
        Method[] methods = aClass.getMethods();

    }

    public static void test(B test) {
        test.setName("lishi");
        System.out.println("test = " + test.getName());
    }
}

class B {
    private String name;

    static {
        System.out.println("true = " + true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}