package com.ynh.designpattern.state.state;

import com.ynh.designpattern.state.Context;

/**
 * Created by niehua.yang on 2019/3/12
 *
 * 用类保持状态, 就可以切换类方便的改变对象的状态
 *
 * 白天和晚上是两个不同的实现，方法有不同的输出
 *
 *
 * 实例程序：警戒状态每小时（测试为每秒）会改变的金库警报系统
 *
 * 角色：状态
 *
 *      例子对比：
 *      不使用State模式:  用if条件分支判断状态
 *          使用金库被调用的方法
 *          if(白天){
 *              向警报中心报告使用记录
 *          }else{
 *               向警报中心报告紧急事态
 *           }
 *
 *      使用State模式:  用类表示状态
 *          白天{
 *              使用金库被调用的方法（）{
 *                  向警报中心报告使用记录
 *              }
 *          }
 *          晚上{
 *               使用金库被调用的方法（）{
 *                  向警报中心报告紧急事态
 *              }
 *          }
 *
 *       所以当状态非常多时，State模式的优势就非常明显
 *
 *    两点：
 *      1、定义接口，声明抽象方法
 *      2、定义多个类，实现具体的方法
 *
 *    优点：
 *     1、易于增加新的状态
 *     2、状态分类，不会自相矛盾
 *
 *    相关设计模式：
 *        1、Singleton模式：State模式在定义表示状态的类中会使用Singleton模式
 *        2、Flyweight模式：State模式在表示状态的类中没有定义任何实例字段。因此，有时可以使用Flyweight模式在
 *                          多个上下文角色中共享状态
 */

public interface State {
    /**
     * 设置时间
     * @param context
     * @param hour
     */
    void doClock(Context context, int hour);

    /**
     * 使用金库
     * @param context
     */
    void doUse(Context context);

    /**
     * 按下警铃
     * @param context
     */
    void doAlarm(Context context);

    /**
     * 正常通话
     * @param context
     */
    void doPhone(Context context);
}
