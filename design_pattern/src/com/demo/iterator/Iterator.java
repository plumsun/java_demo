package com.demo.iterator;

/**
 * 迭代器
 *
 * @author LiHaoHan
 * @date 2022/12/12
 */
public interface Iterator<T> {
    /**
     * 判断下个下标是否存在值
     *
     * @return
     */
    boolean hasNext();

    /**
     * 获取当前下标所对应的值
     *
     * @return
     */
    T next();
}
