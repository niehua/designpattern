package com.ynh.designpattern.visitor.visite;

import com.ynh.designpattern.visitor.entry.Directory;
import com.ynh.designpattern.visitor.entry.File;

/**
 * Created by niehua.yang on 2019/3/11
 * <p>
 * 访问数据结构并处理数据，数据结构与处理数据被分离开来，当增加一种处理时，不需要修改数据结构的类，只需要写新的访问者
 * <p>
 * 实例程序：使用Composite中用到的那个文件与文件夹作为数据结构
 *
 * 在Composite中，对文件的打印实现的具体的entry中，而visitor在新增的拜访者实例中。
 *
 * 角色：访问者
 *
 * 两点：
 *      1、对于Directory类的实例和File类的实例，我们调用了他们的accept方法，且每个实例只调用一次。
 *      2、对于ListVisitor实例，我们调用了它的visit(Directory)和visit(File)方法，且在同一个拜访者实例中（ListVisitor）
 *
 * 双重分发：
 *          element.accept(visitor);
 *          visitor.accept(element);
 *
 * 优点：易于增加ConcreteVisitor角色
 * 缺点：难以增加ConcreteElement
 *
 * 相关设计模式：
 *        1、Iterator模式：遍历数据结构中的元素，Visitor模式对保存在数据结构中的元素进行某种特定的处理
 *        2、Interpreter模式：生成语法树后，可能会使用Visitor模式访问语法树的各个节点进行处理。
 */

public abstract class Visitor {
    /**
     * 访问文件
     * @param file
     */
    public abstract void visit(File file);

    /**
     * 访问目录
     * @param directory
     */
    public abstract void visit(Directory directory);
}
