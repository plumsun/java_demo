package com.demo.factory.idcard;

import com.demo.factory.framework.Factory;
import com.demo.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author LiHaoHan
 * @date 2022/12/16
 */
public class IDCardFactory extends Factory {

    private List<Product> list = new ArrayList<>();

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner,new Random().nextInt(10));
    }

    @Override
    public void registerProduct(Product product) {
        System.out.println("register");
        list.add(product);
    }
    public List<? extends Product> getValue(){
        return list;
    }
}
