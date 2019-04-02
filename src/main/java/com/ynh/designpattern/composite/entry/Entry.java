package com.ynh.designpattern.composite.entry;

import com.ynh.designpattern.composite.FileTreatmentException;
import lombok.Getter;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 容器与内容的一致性,当查找某个文件夹中有什么东西时，找到的可能时文件夹，也可能是文件。
 *
 * 树结构的数据结构都适用Conposite模式，将文件夹和文件都作为“目录条目”看待，创造递归结构的模式,
 *
 * 实例程序：列出文件夹和文件的一览
 *
 * 角色:一致性
 *
 * Jdk  :  java.awt.Component和java.awt.Container 两个类使用了Composite模式
 *
 * 多个和单个的一致性，即将多个对象结合在一起，当作一个对象进行处理
 *
 * 相关设计模式：
 *       1、Visitor模式：可以用它访问Composite模式的递归结构
 *       2、Command模式：使用宏命令时使用了Composite模式
 *       3、Decorator模式：使装饰框和内容具有一致性
 *                         Composite模式通过Component角色使容器角色和内容具有一致性
 */

public abstract class Entry {

    @Getter
    protected String name;

    /**
     * 返回条目的总大小
     * @return
     */
    public abstract int getSize();

    /**
     * 加入目录条目，当子类没有实现这个功能但却调用了，将会抛出异常
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    /**
     * 为一览加上前缀并显示目录条目一览
     */
    public void printList() {
        printList("");
    }

    /**
     * 为一览加上前缀
     * @param prefix
     */
    protected abstract void printList(String prefix);

    /**
     * 显示代表类的文字
     * @return
     */
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
