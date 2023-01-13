package com.demo.prototype.ext;

import com.demo.prototype.freework.Product;

/**
 * @author LiHaoHan
 * @date 2023/1/4
 */
public abstract class BaseObj implements Product {

    @Override
    public Product createClone() throws CloneNotSupportedException {
        return (Product) clone();
    }
}
