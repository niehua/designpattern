package com.ynh.designpattern.bridge.function;

import com.ynh.designpattern.bridge.iml.DisplayImpl;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 桥梁模式：将类的功能层次结构与实现层次结构分离, 再将分离的两样东西连接起来
 *
 * 功能层次结构:  父类具有基本功能；在子类中添加新的功能
 * 实现层次结构:  父类通过声明抽象方法来定义接口；子类通过实现具体的方法来实现接口
 *
 * 实例程序：显示一些东西
 *
 * 类的功能层次结构
 *
 * 角色：抽象化
 *
 * 相关设计模式：
 *       1、Template Factory模式：使用了“类的实现层次结构”
 *       2、Adapter模式：可以结合那些功能上相似但是接口不同的类。
 *                       Bridge模式可以到达类的功能层次结构与实现层次结构分离的目的，并再次基础上是这些层次结构结合起来
 */

public class Display {
    /**
     * 两个层次结构的桥梁
     */
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
