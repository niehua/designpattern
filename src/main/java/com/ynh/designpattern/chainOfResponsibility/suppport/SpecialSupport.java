package com.ynh.designpattern.chainOfResponsibility.suppport;

import com.ynh.designpattern.chainOfResponsibility.Trouble;

public class SpecialSupport extends Support {
    /**
     * 只能解决指定编号的问题
     */
    private int number;

    public SpecialSupport(String name, int number) {    // 构造函数
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {        // 解决问题的方法
        if (trouble.getNumber() == number) {
            return true;
        } else {
            return false;
        }
    }
}
