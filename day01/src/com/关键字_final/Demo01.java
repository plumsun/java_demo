package com.关键字_final;

/*
*   1. final修饰类
*           那么此类是最终类,不可被继承
*
*   2. final修饰方法
*           那么此方法是最终方法, 不可被重写
*
*           讨论: private修饰的方法也不能被重写 (子类不能直接访问到)
*           那么private和final修饰的方法有什么区别呢?
*
*           private修饰的方法不仅不能重写,还不能被直接访问
*           但是final方法
* */
public class Demo01 {

    public static void main(String[] args) {

        D d = new D();
        d.show();
    }
}
final class A{

}
/*
    不可继承A
class B extends A{

}*/
class C{
    public final void show(){

    }
    private void speak(){

    }
}
class D extends C{
    /*@Override
    private void speak(){

    }
    @Override
    public void show() {

    }*/
}

