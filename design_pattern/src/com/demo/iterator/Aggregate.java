package com.demo.iterator;

/**
 * @author LiHaoHan
 * @date 2022/12/12
 */
public interface Aggregate<T> {

    Iterator<T> iterator();
}
