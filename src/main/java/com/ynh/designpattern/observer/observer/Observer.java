package com.ynh.designpattern.observer.observer;

import com.ynh.designpattern.observer.generator.NumberGenerator;

/**
 * Created by niehua.yang on 2019/3/12
 * <p>
 * 观察者模式，发送状态变化通知
 * <p>
 * 当观察对象发生变化时，会通知给观察者；
 * 不过Observer角色并非主动地去观察，而是被动的接受来自Subject角色的通知。所以又称为“发布-订阅”模式
 * <p>
 * 实例程序：观察者观察一个会生成数值的对象，并将生成的数值结果显示出来。
 * <p>
 * 角色：观察者，子类是具体的观察者
 * <p>
 * Jdk  :  java.util.observer
 *
 * 轻松的替换类的特点：
 *      1、利用抽象类和接口从具体类中抽象出抽象方法
 *      2、在将实例作为参数传递至类中，或者在类的字段中保存实例时，不适用具体类型，而是使用抽象类或接口
 */

public interface Observer {
    /**
     * 对象发生变化时，通知观察者
     * @param generator
     */
    void update(NumberGenerator generator);
}
