package com.ynh.designpattern.abstractFactory.factory;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * html超链接
 *
 * 抽象产品
 */

public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
