package com.demo;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/**
 * @description:
 * @date: 2022/6/18 16:47
 * @author: LiHaoHan
 * @program: com.demo
 */
public class WeakHashMapDemo {

    public static void main(String[] args) {
        /*
            weakHashMap:
            当容器中某个元素的key无效后，被gc回收了
            那在容器中对应的键值对就会被清除
         */
        WeakHashMap<WeakReference<Object>,String> map = new WeakHashMap<>();
        Object o = new Object();
        //弱引用
        WeakReference<Object> reference = new WeakReference<>(o);
        map.put(reference,"弱引用");
        System.out.println("map = "+map);

        //置空对象
        o=null;
        reference=null;
        System.gc();

        System.out.println("map = " + map);
    }
}
