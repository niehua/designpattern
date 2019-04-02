package com.ynh.designpattern.abstractFactory.factory;

/**
 * Created by niehua.yang on 2019/3/6
 * <p>
 * html页面
 */

import java.util.ArrayList;


public abstract class Page {
    protected String title;

    protected String author;

    protected ArrayList<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        String filename = title + ".html";

        System.out.println(filename + " 编写开始======================。");
        System.out.println(makeHTML());
        System.out.println(filename + " 编写完成======================。");

    }

    public abstract String makeHTML();
}
