package com.ynh.designpattern.bridge.iml;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 类的实现层次结构
 *
 * 角色：具体的实现者
 */

public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int length;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.length = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        //前后加上"|"并显示
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        // 显示用来表示方框的角的"+"
        System.out.print("+");
        // 将其用作方框的边框
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        // 显示用来表示方框的角的"+"
        System.out.println("+");
    }
}
