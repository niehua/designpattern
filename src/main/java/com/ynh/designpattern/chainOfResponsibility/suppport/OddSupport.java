package com.ynh.designpattern.chainOfResponsibility.suppport;

import com.ynh.designpattern.chainOfResponsibility.Trouble;

public class OddSupport extends Support {
    public OddSupport(String name) {                // 构造函数
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {    // 解决问题的方法
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
