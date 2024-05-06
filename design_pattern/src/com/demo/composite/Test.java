package com.demo.composite;

/**
 * @author LiHaoHan Created on 2024/4/1
 */
public class Test {

    public static void main(String[] args) {
        Directory directory = new Directory("test");
        directory.add(new File("file-test1", 100));
        directory.add(new File("file-test2", 100));
        directory.add(new File("file-test3", 100));
        Directory child = new Directory("child");
        directory.add(child);
        File file = new File("child-test", 200);
        child.add(file);
        file.getAbsoluteFile();

        directory.printList();
    }
}
