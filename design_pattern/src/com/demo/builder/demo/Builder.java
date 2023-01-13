package com.demo.builder.demo;

/**
 * 构建者
 *
 * @author LiHaoHan
 * @date 2023/1/4
 */
public abstract class Builder {

    /**
     * 初始化状态
     */
    protected boolean initialized = false;

    void init() {
        if (!initialized) {
            initBuild();
            initialized = true;
        }
    }

    void process() {
        if (initialized) {
            buildAfter();
        }
    }

    void close() {
        if (initialized) {
            buildClose();
        }
    }

    /**
     * 初始化建造者
     */
    protected abstract void initBuild();

    /**
     * 业务处理
     */
    protected abstract void buildAfter();

    /**
     * 资源关闭
     */
    protected abstract void buildClose();
}
