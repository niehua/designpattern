package com.ynh.designpattern.bridge.iml;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 类的实现层次结构
 *
 * 角色：实现者
 */


public abstract class DisplayImpl {
    public abstract void rawOpen();

    public abstract void rawPrint();

    public abstract void rawClose();
}
