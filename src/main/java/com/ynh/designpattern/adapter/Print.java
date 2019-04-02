package com.ynh.designpattern.adapter;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 加个适配器以便于复用，也被称为“Wrapper模式”，包装器。
 *
 * 目的：  连接接口（api）不同的类, 弥补现有程序与所需程序之间的差异。
 *         有时候我们并非从零开始编程，经常可以利于现有的类，一般现有的类也是安全，经过检测的。
 *
 *  场景：版本升级与兼容
 *
 *  角色：目标对象
 *
 * 实例程序：用继承和委托的两种方式分别适配打印hello字符串。
 *
 * 相关设计模式：
 *       1、Bridge模式：连接类的功能层次结构实现层次结构
 *       2、Decorator模式：不改变接口（api）的前提下增加功能； Adapter适应两种不同的接口
 *       3、Proxy模式：同一个接口
 *
 *
 */

public interface Print {

    void printWeak();

    void printStrong();
}
