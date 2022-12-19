package com.demo.singleton;

/**
 * @author LiHaoHan
 * @date 2022/12/19
 */
public class DemoSingleton {

    private DemoSingleton(){}

    enum DemoSingletonEnum{
        /**
         * 采用枚举对已有类做单例处理
         */
        DEMO_SINGLETON_ENUM;
        private DemoSingleton singleton = null;

        DemoSingletonEnum(){
            singleton = new DemoSingleton();
        }

        private DemoSingleton getInstance(){
            return singleton;
        }
    }
    public static DemoSingleton getInstance(){
        return DemoSingletonEnum.DEMO_SINGLETON_ENUM.getInstance();
    }
}
