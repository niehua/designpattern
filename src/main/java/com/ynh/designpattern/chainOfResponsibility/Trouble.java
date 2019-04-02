package com.ynh.designpattern.chainOfResponsibility;

import lombok.Getter;

/**
 * Created by niehua.yang on 2019/3/11
 *
 * 问题
 */


public class Trouble {
    /**
     * 问题编号
     */
    @Getter
    private int number;

    public Trouble(int number) {    // 生成问题
        this.number = number;
    }

    @Override
    public String toString() {      // 代表问题的字符串
        return "[Trouble " + number + "]";
    }
}
