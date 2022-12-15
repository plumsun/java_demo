package com.demo.adapter.demo;


import java.io.*;
import java.time.LocalDateTime;
import java.util.Properties;

/**
 * adapter
 *
 *
 * @author LiHaoHan
 * @date 2022/12/15
 */
public class FileProperties extends Properties implements FileIo{

    public FileProperties() {
        super();
    }

    @Override
    public void readListToFile(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(String.valueOf(fileName));
        load(inputStream);
        System.out.println(this);
    }

    @Override
    public void writeListToFile(String fileName) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(String.valueOf(fileName));
        LocalDateTime now = LocalDateTime.now();
        store(outputStream,now.toString());
        System.out.println(this);
    }

    @Override
    public void saveListToFile(String key,String value) throws IOException {
        this.setProperty(key, value);
    }

    @Override
    public Object getValue(String key) {
        return this.get(key);
    }
}
