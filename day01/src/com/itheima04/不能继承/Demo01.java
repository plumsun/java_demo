package com.itheima04.不能继承;

public class Demo01 {

    public static void main(String[] args) {

        B b = new B();
        b.setName("张三");
        String name = b.getName();
        System.out.println(name);
    }
}

class A{
    //本类内部使用,其他地方不能用
    private String name;
    public A(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class B extends A{
    public B(){

    }
}