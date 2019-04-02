package com.ynh.designpattern.decorator.display;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 装饰边框与被装饰物的一致性
 *
 * 程序和蛋糕很相似。首先有一个蛋糕，然后像不断的装饰蛋糕一样的对其增加功能，它就变成了使用目标更加明确的对象。
 *
 * 实例程序：给文字添加装饰边框
 *
 * 角色：Component,增加功能时的核心角色，定义了蛋糕的接口
 *
 * 特点：1、装饰边框与被装饰物的一致性，在实例中，被b4被装饰了多次，但接口却没有发生任何变化
 *       2、使用了委托，对“装饰边框”提出的要求会被转交给“被装饰物”处理，弱关联，所以可以动态添加许多功能
 *
 * Jdk：java.io使用了装饰模式  eg:Reader -> FileReader -> BufferReader
 *      javax.swing.border: 提供可以为界面中的控件添加装饰边框的类
 */

public abstract class Display {
    /**
     * 获取横向字符数
     * @return
     */
    public abstract int getColumns();

    /**
     * 获取纵向行数
     * @return
     */
    public abstract int getRows();

    /**
     * 取第row行的字符串
     * @param row
     * @return
     */
    public abstract String getRowText(int row);

    /**
     * 获全部显示
     */
    public void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
