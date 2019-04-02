package com.ynh.designpattern.factoryMethod.framework;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 限定生成的子类对象的必须具有use这个特点，例如：如果是car，不行，这时需要一个run跑的方法
 *
 * 产品
 */

public abstract class Product {
    public abstract void use();
}
