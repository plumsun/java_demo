package com.接口;

public interface MyInterface {
    public final static  int A = 1;
    //默认public static final修饰
    int B = 2;

    //完整版的抽象方法定义
    public abstract void method01();
    //简略版的抽象方法定义(隐藏public abstract)
    void method02();

    public default void method03(){
        System.out.println("默认方法");
    }
    //默认用public修饰
    default void method04(){
        System.out.println("默认方法");
    }

    public static void method05(){
        System.out.println("静态方法");
    }
    //默认用public修饰
    static void method06(){
         System.out.println("静态方法");
    }
}
