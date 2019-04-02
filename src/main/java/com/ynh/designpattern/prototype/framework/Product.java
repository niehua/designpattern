package com.ynh.designpattern.prototype.framework;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * Cloneable：里面没有任何东西，属于标记接口
 * clone（）：
 *          在Object里面，是一个本地方法，内部进行的处理是：1、分配与要复制的实例同样大小的内存空间
 *                                                          2、接着将要复制的实例中的字段的值复制到所分配的内存空间中。
 *          它时浅复制，将被复制的实例字段值直接复制到新的实例中。当字段保存的是数组时，只会复制引用，不会复制数组中的元素。
 *          想要深复制，需要重写clone方法，并记得调用super.clone().
 *          clone方法只会复制，不会调用类的构造函数。
 *
 * 原型模式：通过复制实例生成实例
 *
 *   不根据类名生成实例，也就是不能new,而根据现有的实例复制而得
 *
 *   实例程序：将字符串放入方框中显示出来或是加上上下划线显示出来
 *
 *   场景：
 *      1、对象种类繁多，无法将他们整合到一个类（实例程序：三种样式随时可取出）
 *      2、生成实例的过程态复杂，难以根据类生成实例
 *      3、想解偶框架与生成的实例时，此时不能指定类名来生成实例（实例程序：map存储）
 *
 *   角色：原型
 *
 *   在代码中出现要使用的类名并非总是坏事。不过一旦在代码中出现使用的类名，就无法与该类分离开来，也就无法实现复用。
 *   即使没有.java文件，只有.class也能复用该类才是关键。
 *
 *   相关设计模式：
 *        1、Flyweight模式：Prototype模式生成一个与当前实例状态完全相同的实例，而使用Flyweight模式可以在不同地方使用同一个实例
 *        2、Memento模式：可以保存当前实例的状态，以实现快照和撤销的功能
 *        3、Command模式：复制Command模式的命令时，可以使用Prototype模式
 */

import java.lang.Cloneable;

public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
