package com.ynh.designpattern.abstractFactory.tablefactory;


import com.ynh.designpattern.abstractFactory.factory.Factory;
import com.ynh.designpattern.abstractFactory.factory.Link;
import com.ynh.designpattern.abstractFactory.factory.Page;
import com.ynh.designpattern.abstractFactory.factory.Tray;

public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
