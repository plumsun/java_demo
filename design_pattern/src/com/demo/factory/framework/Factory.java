package com.demo.factory.framework;

/**
 * @author LiHaoHan
 * @date 2022/12/16
 */
public abstract class Factory {

    public abstract Product createProduct(String owner);
    public abstract void registerProduct(Product product);


    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

}
