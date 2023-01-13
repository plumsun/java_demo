package com.demo.factory.idcard;

import com.demo.factory.framework.Factory;
import com.demo.factory.framework.Product;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 工厂类
 *
 * @author LiHaoHan
 * @date 2022/12/16
 */
public class IDCardFactory extends Factory {

    private Random random = SecureRandom.getInstanceStrong();

    /**
     * 资源类容器
     */
    private final List<Product> list = new ArrayList<>();

    public IDCardFactory() throws NoSuchAlgorithmException {
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, random.nextInt(10));
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println("register");
        list.add(product);
    }

    public List<Product> getValue() {
        return list;
    }
}
