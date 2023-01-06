package com.demo.prototype.freework;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author LiHaoHan
 * @date 2023/1/4
 */
public class Manager {
    private ConcurrentHashMap<String,Product> map = new ConcurrentHashMap<>();

    public void register(String name,Product t){
        map.put(name,t);
    }
    public Product create(String name) throws CloneNotSupportedException {
        Product product = map.get(name);
        return product.createClone();
    }
}
