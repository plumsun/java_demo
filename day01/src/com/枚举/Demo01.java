package com.枚举;

public class Demo01 {

    public static void main(String[] args) {

        Person zs = new Person("张三", "女");
        Person ls = new Person("李四", "男");
        /*
        *   String sex = "呵呵"
        *       语法没错, 但是跟实际业务不符, 所以开发上也认为是错的
        *
        * */
        Person ww = new Person("王五", "呵呵");

        System.out.println("----------");

        /*
        *   将Student的属性sex类型设置 SEX (这个类经过特殊设计)
        *   那么创建Student对象,就不能乱赋值sex属性
        *
        * */
        Student ml = new Student("马六", Sex.GIRL);
        Student qq = new Student("钱七", Sex.BOY);

        //com.itheima07.枚举.Sex@1540e19d
        System.out.println(ml.sex);
        System.out.println(Sex.GIRL);


        System.out.println("---------------");

        Teacher zb = new Teacher("赵八", MySex.GIRL);


        System.out.println("---------");

        Season s = Season.SUMMER;
    }
}
class Person{
    String name;
    String sex;

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
}
class Student{
    String name;
    Sex sex;

    public Student(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }
}
/*
*   1. private 构造
*   2. 提供两个static的Sex类型对象(GIRL,BOY)
* */
class Sex {
    //之所以用static修饰,因为当前类外部不能创建对象,只能用类名访问
        //final修饰是常量, new 出来的都是对象
    public static final Sex GIRL = new Sex(); //A对象
    public static final Sex BOY = new Sex(); // B对象
    //private构造只能内部使用
    private Sex(){

    }
}
enum MySex{
    GIRL,
    BOY;
}
class Teacher{
    String name;
    MySex sex;

    public Teacher(String name, MySex sex) {
        this.name = name;
        this.sex = sex;
    }
}

enum Season{
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER
}
