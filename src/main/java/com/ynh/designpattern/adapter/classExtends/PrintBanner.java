package com.ynh.designpattern.adapter.classExtends;

import com.ynh.designpattern.adapter.Banner;
import com.ynh.designpattern.adapter.Print;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 适配器角色
 *
 * 使用继承的类适配器
 */

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
