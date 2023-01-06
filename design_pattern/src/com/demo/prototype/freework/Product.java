package com.demo.prototype.freework;

/**
 * @author LiHaoHan
 * @date 2023/1/4
 */
public interface Product extends Cloneable{
    void use();
    Product createClone() throws CloneNotSupportedException;
}
