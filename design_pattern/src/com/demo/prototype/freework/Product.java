package com.demo.prototype.freework;

/**
 * @author LiHaoHan
 * @date 2023/1/4
 */
public interface Product extends Cloneable{
    /**
     * 业务处理
     */
    void use();

    /**
     * 实例clone
     * @throws  CloneNotSupportedException
     * @return Product
     */
    Product createClone() throws CloneNotSupportedException;
}
