package com.ynh.designpattern.factoryMethod.framework;

/**
 * Created by niehua.yang on 2019/3/6
 *
 *  将实例的生成交给子类
 *
 * 父类决定生成实例的方式，但不决定所要生成的具体的类，具体的处理全部交给子类，
 *
 * 将生成实例框架和生成实例的类解耦
 *
 * 实例程序：制作身份证
 *
 * 与product组成生成实例的框架，实现了create的抽象类，决定创建一个对象的流程、框架，运用了模板方法模式
 * 框架独立于iDCard包
 *
 * 角色：创建者
 *
 *
 * Jdk  :  java.util.Calendar的getInstance方法
 *         java.secure.SecureRandom的getInstance方法
 *         java.text.NumberFormat的getInstance方法
 *
 * 相关设计模式：
 *        1、Singleton模式：大多数情况下可以将Singleton模式用于扮演Create（或ConcreteCreate）角色
 *        2、Composite模式：有时可以将Composite模式用于扮演Product（或ConcreteProduct）角色
 *
 */


public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
