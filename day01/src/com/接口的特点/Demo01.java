package com.接口的特点;

public class Demo01 {

    public static void main(String[] args) {


    }
}
interface A{
    //默认用public abstract
    void method01();
    void method02();
}
//快捷键: ctrl + i (implements)
class B implements A{

    @Override
    public void method01() {

    }

    @Override
    public void method02() {

    }
}
abstract class C implements A{

}
