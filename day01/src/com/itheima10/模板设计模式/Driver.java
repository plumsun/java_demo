package com.itheima10.模板设计模式;

public abstract class Driver {
    //模板
    public void drive(){
        System.out.println("启动: 踩离合, 点火, 挂挡起步");
        this.style();
        System.out.println("停车: 踩刹车,熄火");
    }
    //开车风格
    public abstract void style();
}
class ADriver extends Driver{
    @Override
    public void style() {
        System.out.println("单手漂移");
    }
}
class BDriver extends Driver{
    @Override
    public void style() {
        System.out.println("一路狂飙");
    }
}
