package com.ynh.designpattern.bridge.function;

import com.ynh.designpattern.bridge.iml.DisplayImpl;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 增加了“只显示规定次数”这一功能
 *
 * 类的功能层次结构
 *
 * 角色：改善后的抽象化
 */


public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {       // 循环显示times次
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
