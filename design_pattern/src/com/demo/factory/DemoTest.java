package com.demo.factory;

import com.demo.factory.framework.Product;
import com.demo.factory.idcard.IDCardFactory;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

/**
 * @author LiHaoHan
 * @date 2022/12/16
 */
public class DemoTest {

    @Test
    public void test() throws NoSuchAlgorithmException {
        IDCardFactory factory = new IDCardFactory();
        Product product1 = factory.create("1");
        Product product2 = factory.create("2");
        Product product3 = factory.create("3");
        Product product4 = factory.create("4");
        product1.use();
        product2.use();
        product3.use();
        product4.use();
        System.out.println(factory.getValue());
    }
}
