package com.demo.composite;

/**
 * @author LiHaoHan Created on 2024/4/1
 */
public abstract class Entity {

    public abstract String getName();

    public abstract Integer getSize();

    public abstract String getPath();

    public void printList() {
        printList("");
    }

    public abstract void printList(String prefix);

    public void getAbsoluteFile(Entity entity) {
        entity.printList();
    }

    public Entity add(Entity entity) {
        throw new FileBusinessException();
    }

    public String toString() {
        return this.getName() + "(" + this.getSize() + ")";
    }
}
