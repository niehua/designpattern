package com.ynh.designpattern.strategy.strategy;

import com.ynh.designpattern.strategy.HandValueEnum;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 策略模式：整体的替换算法
 *      整体的替换算法的实现部分，能让我们轻松的以不同的算法去解决同一个问题
 *
 * 实例程序：让电脑玩猜拳游戏
 *      第一种策略：如果这一局猜拳获胜，那么下一局也出一样的手势
 *      第二种：    根据上一局的手势从概率上计算出下一局的手势。
 *
 * 角色：策略
 *
 * 特点：将算法与其他部分分离开来，只定义了和算法相关的接口，然后已委托的方式使用算法，使用委托的这种弱关联反射光hi可以
 *      很方便的替换算法
 *
 * 相关设计模式：
 *       1、Abstract Factory 模式：整体替换抽象工厂，Strategy模式：整体替换算法
 *       2、State模式：ConcreateState角色表示“状态”的类，每次状态变化时，被委托对象的类都将被替换
 *       3、Decorator模式：改变装饰物的边框或是为装饰物添加多重边框来增加类的功能
 *
 */

public interface Strategy {
    HandValueEnum nextHand();

    void study(boolean win);
}
