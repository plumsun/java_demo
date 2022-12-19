package com.demo.singleton;

/**
 * 枚举（简单，懒加载特性，推荐）
 * @author LiHaoHan
 * @date 2022/12/19
 */
public enum Singleton {
    /**
     * 实例
     */
    SINGLETON;

    /**
     * 业务处理
     */
    public void businessMethod() {}
}
