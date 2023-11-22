package com.抽象类;

public class Demo01 {

    public static void main(String[] args) {
//        new Animal();
    }
}

abstract class Animal{
    /*
        #抽象方法
    *   1. 当我们在定义一个类的时候,知道这个类有某方法, 但是不知道具体的实现:就有了抽象方法
    *   2. 抽象方法是没有方法体的方法,在方法声明中,需要关键字abstract
    *   3. 拥有抽象方法的类,必须是抽象类,用abstract修饰
    *
    * */
    public abstract void shout();
}
abstract class Dog extends Animal{

}
/*
    万能快捷键: alt + enter
    ctrl + i (implements 实现) : 实现父类的抽象方法
* */
class Cat extends Animal{

    @Override
    public void shout() {
        System.out.println("猫喵喵叫");
    }
}
