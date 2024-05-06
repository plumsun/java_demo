package com.demo.composite;

/**
 * @author LiHaoHan Created on 2024/4/1
 */
public class File extends Entity {

    private String name;

    private Integer size;

    public File(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    @Override
    public String getPath() {
        return null;
    }

    public void getAbsoluteFile() {
        super.getAbsoluteFile(this);
    }
}
