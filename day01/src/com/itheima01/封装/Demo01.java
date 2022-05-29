package com.itheima01.封装;

public class Demo01 {

    public static void main(String[] args) {
        //创建实例
        Person p = new Person();
        p.setName("张三");
        //非法操作: 业务中年龄不能为负
//        p.age = -18;
        p.setAge(-18);

        System.out.println(p.getAge());
    }
}
