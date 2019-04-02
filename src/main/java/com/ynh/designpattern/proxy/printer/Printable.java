package com.ynh.designpattern.proxy.printer;

/**
 * Created by niehua.yang on 2019/3/12
 *
 * 只在必要时刻生成实例,可以使用代理人来提高处理速度
 *
 * 当不一定需要本人亲自工作时，可以寻找代理人去完成工作，但代理人能做的事有限
 *
 *
 * 实例程序：带名字的打印机
 *
 * 角色：主体
 *
 * 特点：
 *      1、代理和委托：代理人只能解决一部分问题，当遇到不会的会转交（委托）给本人去解决。
 *      2、透明性：代理和本人是同一个接口
 *
 *  相关设计模式：
 *       1、Decorator模式：目的在于增加增加新的新的功能，而Proxy模式更注重通过代理来减轻本人的工作负担。
 *
 */

public interface Printable {
    /**
     * 设置名字
     * @param name
     */
    void setPrinterName(String name);

    /**
     * 获取名字
     * @return
     */
    String getPrinterName();

    /**
     * 显示文字（打印输出）
     * @param string
     */
    void print(String string);
}
