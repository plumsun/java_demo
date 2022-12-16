package com.demo.factory.idcard;

import com.demo.factory.framework.Product;

import java.io.InputStream;
import java.util.Objects;

/**
 * @author LiHaoHan
 * @date 2022/12/16
 */
public class IDCard extends Product {

    private String owner;
    Integer number;

    public IDCard(String owner,Integer number) {
        this.owner = owner;
        this.number= number;
        System.out.println("create");
    }

    @Override
    public void use() {
        System.out.println("use");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IDCard)) return false;
        IDCard idCard = (IDCard) o;
        return Objects.equals(getOwner(), idCard.getOwner()) && Objects.equals(number, idCard.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOwner(), number);
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "owner='" + owner + '\'' +
                ", number=" + number +
                '}';
    }
}
