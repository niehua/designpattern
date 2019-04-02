package com.ynh.designpattern.singleton.safe;


/**
 * 同步的懒汉模式
 *
 * 不推荐，单例生成了，每次拿单例还需要上锁。
 */

public class SingletonSynchronizedLazy {

    // 私有构造函数
    private SingletonSynchronizedLazy() {

    }

    // 单例对象
    private static SingletonSynchronizedLazy instance = null;

    // 静态的工厂方法
    public static synchronized SingletonSynchronizedLazy getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronizedLazy();
        }
        return instance;
    }
}
