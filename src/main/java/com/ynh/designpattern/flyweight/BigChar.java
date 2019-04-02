package com.ynh.designpattern.flyweight;

/**
 * Created by niehua.yang on 2019/3/12
 *
 * 大型字符
 *
 * 轻量级（被共享的角色）
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {

    private char charname;

    private String fontdata;


    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("big" + charname + ".txt")
            );
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    /**
     * 显示大型字符
     */
    public void print() {
        System.out.print(fontdata);
    }
}
