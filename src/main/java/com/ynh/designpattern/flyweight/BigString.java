package com.ynh.designpattern.flyweight;

/**
 * Created by niehua.yang on 2019/3/12
 *
 * 多个大型字符组成大型字符串，共享对象，避免浪费，轻量级的
 *
 * 角色：请求者
 *
 * 场景：当程序需要大量对象时，如果都使用new关键字来分配内存，将会消耗大量内存空间
 *          而使用Flyweight模式，通过尽量共享实例来避免new出实例
 *
 *  实例程序：将许多普通字符组合成为“大型字符”
 *
 * 相关设计模式：
 *      1、Proxy模式：设置代理提高程序的处理速度；
 *                      如果生成实例的处理需要花费较长时间，那么使用Flyweight模式可以提高程序处理速度
 *      2、Singleton模式：FlyweightFactory角色可能会使用Singleton模式。
 */


public class BigString {

    private BigChar[] bigchars;


    public BigString(String string) {
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }


    public void print() {
        for (int i = 0; i < bigchars.length; i++) {
            bigchars[i].print();
        }
    }
}
