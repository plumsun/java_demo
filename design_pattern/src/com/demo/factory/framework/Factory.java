package com.demo.factory.framework;

/**
 * @author LiHaoHan
 * @date 2022/12/16
 */
public abstract class Factory {

    /**
     * 资源类创建
     *
     * @param owner
     * @return
     */
    protected abstract Product createProduct(String owner);

    /**
     * 注册资源类
     *
     * @param product
     */
    protected abstract void registerProduct(Product product);


    /**
     * 工厂创建资源类流程
     *
     * @param owner
     * @return
     */
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

}
