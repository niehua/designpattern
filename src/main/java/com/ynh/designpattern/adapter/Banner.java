package com.ynh.designpattern.adapter;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 现有程序
 * 角色：被适配
 *
 * banner: 广告横幅的意思
 */

public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
