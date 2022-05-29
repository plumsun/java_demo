package com.itheima07.继承的构造方法;

public class Animal {
    private String name;
    private int age;
    public Animal(){

    }
    public Animal(int a){

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Dog extends Animal{
    private String type;
    public Dog(){
//        super();
        super(1);
    }
   /* public Dog(String name,int age,String type){
        setName(name);
        setAge(age);
        this.type = type;
    }*/
   /*
   * 为什么子类的构造,可以调用父类的构造?
   *    在通过子类构造创建对象的时候, 父类的属性由父类构造自己赋值 ,更符合面向对象的封装
   * */
   public Dog(String name,int age,String type){
       super(name,age);
       this.type = type;
   }


}
