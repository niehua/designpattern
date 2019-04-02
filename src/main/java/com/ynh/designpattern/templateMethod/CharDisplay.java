package com.ynh.designpattern.templateMethod;

/**
 * Created by niehua.yang on 2019/3/6
 *
 * 打印字符
 */

public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");                     // 显示开始字符"<<"
    }

    @Override
    public void print() {
        System.out.print(ch);                       // 显示保存在字段ch中的字符
    }

    @Override
    public void close() {
        System.out.println(">>");                   // 显示结束字符">>"
    }
}
