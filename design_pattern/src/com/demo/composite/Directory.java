package com.demo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiHaoHan Created on 2024/4/1
 */
public class Directory extends Entity {

    private final String name;

    private final List<Entity> entities = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getSize() {
        return entities.stream().mapToInt(Entity::getSize).sum();
    }

    @Override
    public void printList(String prefix) {
        /**
         * 字符串拼接对象时，会默认调用对象的toString()方法
         */
        System.out.println(prefix + "/" + this);
        entities.forEach(entity -> entity.printList(prefix + "/" + name));
    }

    @Override
    public void getAbsoluteFile(Entity entity) {
        /**
         * 字符串拼接对象时，会默认调用对象的toString()方法
         */
        entity.printList("/" + name);
    }

    @Override
    public String getPath() {
        return this.name;
    }


    @Override
    public Entity add(Entity entity) {
        this.entities.add(entity);
        return this;
    }
}
