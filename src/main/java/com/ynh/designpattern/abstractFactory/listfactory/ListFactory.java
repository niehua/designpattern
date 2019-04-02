package com.ynh.designpattern.abstractFactory.listfactory;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * listfactory：具体工厂，零件，产品
 *
 * 具体工厂
 */

import com.ynh.designpattern.abstractFactory.factory.Factory;
import com.ynh.designpattern.abstractFactory.factory.Link;
import com.ynh.designpattern.abstractFactory.factory.Page;
import com.ynh.designpattern.abstractFactory.factory.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
