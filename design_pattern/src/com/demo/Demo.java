package com.demo;

import java.net.ServerSocket;
import java.util.HashMap;

public class Demo {

    static HashMap<String,Tactics> map = new HashMap<>();

    static {
        map.put("1",new StatusTest1());
        map.put("2",new StatusTest2());
    }

    public static void main(String[] args) {
        ServerSocket
        int a =1,b=3;
        System.out.println("a = " + a+b);
        System.out.println("a = " + a*b);
        System.out.println("a = " + a/b);
        System.out.println("a = " + a-b);
        Documents documents = new Documents("1");
        test(documents);
    }

    public static void test(Documents documents){
        Tactics tactics = map.get(documents.getStatus());
        tactics.process();
    }
}

class Documents {
    private String status;

    public Documents(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


interface Tactics{
    void process();
}

class StatusTest1 implements Tactics{
    @Override
    public void process() {
        System.out.println(" 单据状态1");
    }
}

class StatusTest2 implements Tactics{
    @Override
    public void process() {
        System.out.println(" 单据状态2");
    }
}