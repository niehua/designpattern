package com.ynh.designpattern.chainOfResponsibility.suppport;

import com.ynh.designpattern.chainOfResponsibility.Trouble;

public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    /**
     *  自己什么也不处理
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {     // 解决问题的方法
        return false;
    }
}
