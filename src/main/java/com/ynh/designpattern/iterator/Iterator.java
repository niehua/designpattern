package com.ynh.designpattern.iterator;

/**
 * @author niehua.yang
 * @date 2019/3/6
 * <p>
 * 迭代器：顺序遍历集合元素的接口
 * <p>
 * 类比：Iterator<E>
 * <p>
 * 迭代器用在局部域中，所以会到时自动GC
 * <p>
 * Jdk  :  java.util.Iterator
 * <p>
 * 相关设计模式：
 *      1、Visitor模式：遍历元素的过程中，对元素进行处理
 *      2、Factory Method模式：iterator方法的实例可能会使用。
 */
public interface Iterator<E> {
    boolean hasNext();//确认接下来是否可以调用next方法

    E next();//返回当前元素，指向下一个元素
}
