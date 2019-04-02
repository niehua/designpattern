package com.ynh.designpattern.templateMethod;

/**
 * Created by niehua.yang on 2019/3/6
 *
 *  模板方法模式：将具体处理交给子类
 *
 * 这些定义在父类中的方法大多是抽象方法，所以查看父类的代码无法知道源码，只知道父类是如何调用这些方法的
 * 这里父类作为组件，可重用
 *
 * 在父类中定义处理流程的框架
 * 在子类中实现具体的处理
 *
 * 实例程序：将字符和字符串循环显示5次
 *
 *  角色：抽象类
 *
 *  相关设计模式：
 *        1、Factory Method模式：使用模板方法模式生成实例的典型例子
 *        2、Strategy模式：模板方法模式使用继承改变程序的行为（改变部分程序行为），
 *                         Strategy策略模式使用委托改变程序的行为（替换整个算法）。
 */

public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();                         // 首先打开…
        for (int i = 0; i < 5; i++) {   // 循环调用5次print
            print();
        }
        close();                        // …最后关闭。这就是display方法所实现的功能
    }
}
