package com.ynh.designpattern.templateMethod;

/**
 * Created by niehua.yang on 2019/3/6
 * <p>
 * 打印字符串
 */

public class StringDisplay extends AbstractDisplay {

    private String string;
    private int length;

    public StringDisplay(String string) {
        this.string = string;
        this.length = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");         // 给保存在字段中的字符串前后分别加上"|"并显示出来 
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");                          // 显示表示方框的角的"+"
        for (int i = 0; i < length; i++) {               // 显示length个"-",组成方框的边框
            System.out.print("-");
        }
        System.out.println("+");                        // /显示表示方框的角的"+"
    }
}
