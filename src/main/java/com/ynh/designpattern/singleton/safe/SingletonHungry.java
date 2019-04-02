package com.ynh.designpattern.singleton.safe;


/**
 * 饿汉模式
 * 单例实例在类装载时进行创建， 如果用在程序启动中，会造成程序启动慢，体验不好
 *
 */

public class SingletonHungry {

    // 私有构造函数
    private SingletonHungry() {

    }

    // 单例对象
    private static SingletonHungry instance = new SingletonHungry();

    //同样的效果
    /*private static SingletonHungry instance = null;
    static {
        instance = new SingletonHungry();
    }*/

    // 静态的工厂方法
    public static SingletonHungry getInstance() {
        return instance;
    }
}
