package com.ynh.designpattern.singleton.unsafe;


/**
 * 懒汉模式
 * 单例实例在第一次使用时进行创建，不安全，并发时首次创建时可能多个线程停留在if语句中
 *
 * 相关设计模式：
 *     1、AbstractFactory模式
 *     2、Builder模式
 *     3、Facade模式
 *     4、Prototype模式
 *     这些模式中一般只会生成一个实例
 */

public class SingletonLazy {

    // 私有构造函数
    private SingletonLazy() {

    }

    // 单例对象
    private static SingletonLazy instance = null;

    // 静态的工厂方法
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
