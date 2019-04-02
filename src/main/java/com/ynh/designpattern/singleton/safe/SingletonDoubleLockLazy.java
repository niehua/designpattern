package com.ynh.designpattern.singleton.safe;

/**
 * 推荐， 解决了懒汉式的不安全，也避免了有单例后每次取单例时的加锁开销
 * 懒汉模式 -》 双重同步锁单例模式
 * 单例实例在第一次使用时进行创建
 */

public class SingletonDoubleLockLazy {

    // 私有构造函数
    private SingletonDoubleLockLazy() {
    }
    // 1、memory = allocate() 分配对象的内存空间
    // 2、ctorInstance() 初始化对象
    // 3、instance = memory 设置instance指向刚分配的内存

    // 单例对象
    private static SingletonDoubleLockLazy instance = null;

    // 静态的工厂方法
    public static SingletonDoubleLockLazy getInstance() {
        if (instance == null) { // 双重检测机制        // B
            synchronized (SingletonDoubleLockLazy.class) { // 同步锁
                if (instance == null) {
                    instance = new SingletonDoubleLockLazy(); // A - 3
                }
            }
        }
        return instance;
    }
}
