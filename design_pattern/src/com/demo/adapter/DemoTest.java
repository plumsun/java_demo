package com.demo.adapter;

import com.demo.adapter.demo.FileIo;
import com.demo.adapter.demo.FileProperties;
import com.demo.adapter.extend.Print;
import com.demo.adapter.extend.PrintBanner;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

/**
 * @author LiHaoHan
 * @date 2022/12/15
 */
public class DemoTest {

    /**
     * 适配器模式（adapter,wrapper）
     * 通过继承实现
     */
    @org.junit.Test
    public void extendsTest(){
        Print print = new PrintBanner("a");
        print.printStrong();
        print.printWeak();
    }

    /**
     * 适配器模式（adapter,wrapper）
     * 通过委托（抽象类）实现
     */
    @org.junit.Test
    public void abstractTest() {
        com.demo.adapter.abstracts.Print print = new com.demo.adapter.abstracts.PrintBanner("a");
        print.printStrong();
        print.printWeak();
    }


    @Test
    public void demoTest() throws IOException {
        FileIo fileIo = new FileProperties();
        fileIo.readListToFile("D:/test.txt");
        System.out.println("fileIo = " + fileIo);
        fileIo.saveListToFile("year","2020");
        fileIo.saveListToFile("m","12");
        fileIo.saveListToFile("day","15");
        fileIo.writeListToFile("D:/demo.txt");
        System.out.println("fileIo = " + fileIo);
        Object day = fileIo.getValue("day");
        System.out.println("day = " + day);
    }
}
