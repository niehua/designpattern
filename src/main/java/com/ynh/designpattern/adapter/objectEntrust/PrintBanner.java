package com.ynh.designpattern.adapter.objectEntrust;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 适配器角色
 *
 * 使用委托的的对象适配器
 */

import com.ynh.designpattern.adapter.Banner;
import com.ynh.designpattern.adapter.Print;

public class PrintBanner implements Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }//构造器初始化被适配者

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
