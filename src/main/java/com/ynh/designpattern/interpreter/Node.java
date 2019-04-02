package com.ynh.designpattern.interpreter;

/**
 * @author niehua.yang
 * @date 2019/4/2
 *
 * 语法规则也是类
 *      在Interpreter模式中，程序要被解决的问题会利用非常简单的“迷你语言”表述出来，即用“迷你语言”编写的“迷你程序”
 *      把具体的问题表述出来。
 *      迷你程序单独是无法工作的 ，需要一个翻译程序（解释器）。这样当解决的问题发生变化时，不需要修改Java代码，只需要修改
 *      迷你程序即可
 *      eg.  迷你语言编写的迷你程序A       ->   迷你语言编写的迷你程序B    (只修改这部分)
 *           使用Java编写的迷你解释器           使用Java编写的迷你解释器
 *           Jvm                                 Jvm
 *
 *  实例程序：控制无线玩具车
 *    语法：go：前进一米
 *          right：右转
 *          left：左转
 *          repeat：重复
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
