package com.extends_继承;

public class Demo02 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "哈士奇";
        dog.age = 2;
        dog.eat();
        dog.run();
        dog.watchDoor();
    }
}
class Animal{
    String name;
    int age;
    public void eat(){
        System.out.println(name + "吃东西");
    }
    public void run(){
        System.out.println(name + "在跑");
    }
}
class Dog extends Animal{
    public void watchDoor(){
        System.out.println(name + "在看门");
    }
}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println(name + "在抓老鼠");
    }
}
