package com.itheima05.继承的成员变量;

import com.itheima05.继承的成员变量.Dog;

public class Demo01 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "哈士奇";
        dog.type = "犬科";
        dog.show();

        Animal a = new Animal();
        a.name = "动物";

        System.out.println("-----------------------");
        /*
        *  现象: 父类有name属性,子类是否有name属性,编译都不会报错
        *  1). 如果子类有name,子类中的方法会优先访问子类的name属性
        *  2). 如果子类没有name,子类中的方法访问父类的name属性
        * */
        Cat cat = new Cat();
        cat.show();
    }
}
class Animal{
    String name = "父类的name";
}
class Cat extends Animal{
    String name = "子类的name";

    public void show(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
class Dog extends Animal{
    String type;

    public void show(){
        System.out.println(name);
        System.out.println(type);
    }
}