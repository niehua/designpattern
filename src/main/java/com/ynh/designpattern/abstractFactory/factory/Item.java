package com.ynh.designpattern.abstractFactory.factory;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 项目
 */

public abstract class Item {

    protected String caption; //标题

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
