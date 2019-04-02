package com.ynh.designpattern.chainOfResponsibility.suppport;

import com.ynh.designpattern.chainOfResponsibility.Trouble;

public class LimitSupport extends Support {
    /**
     * 可以解决编号小于limit的问题
     */
    private int limit;

    public LimitSupport(String name, int limit) {   // 构造函数
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {    // 解决问题的方法
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
}
