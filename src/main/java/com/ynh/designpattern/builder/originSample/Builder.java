package com.ynh.designpattern.builder.originSample;

/**
 * Created by niehua.yang on 2019/3/7
 * <p>
 * 组装复杂的实例
 * <p>
 * 实例程序：编写文档
 * <p>
 * 角色：建造者
 *
 * 相关设计模式：
 *       1、模板方法模式：父类负责对子类实现的方法进行操作。而Builder模式中父类和子类都不关心怎么处理，而用另一个完成这些方法的组合（监工）
 *       2、Abstract Factory模式：都用于生成复杂的实例，通过调用抽象产品的接口来组装抽象产品，生成复杂的实例
 *                                Builder模式中，分阶段制作复杂实例
 *       3、Facade模式：Facade角色则是通过组合内部模块向外部提供可以简单调用的接口
 *                      Builder模式中，Diretor角色通过组合Builder角色中的复杂方法向外部提供可以生成实例的简单接口（construct）
 */

public abstract class Builder{

    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[]items);

    public abstract void close();
}
