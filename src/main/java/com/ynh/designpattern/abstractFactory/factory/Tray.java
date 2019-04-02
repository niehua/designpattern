package com.ynh.designpattern.abstractFactory.factory;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 托盘
 *
 * 含有一个或多个Link类和Tray类容器
 */
import java.util.ArrayList;

public abstract class Tray extends Item {

    protected ArrayList<Item> tray = new ArrayList<>();//ArrayList<? extends Item>错误

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
