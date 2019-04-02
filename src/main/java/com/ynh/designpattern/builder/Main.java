package com.ynh.designpattern.builder;

import com.ynh.designpattern.builder.mySample.MyBuilder;
import com.ynh.designpattern.builder.mySample.MyDirector;
import com.ynh.designpattern.builder.mySample.MyTextBuilder;
import com.ynh.designpattern.builder.originSample.Director;
import com.ynh.designpattern.builder.originSample.HTMLBuilder;
import com.ynh.designpattern.builder.originSample.TextBuilder;

/**
 * Created by niehua.yang on 2019/3/6
 */

public class Main {
    public static void main(String[] args) {

        TextBuilder textbuilder = new TextBuilder();
        Director directorText = new Director(textbuilder);
        directorText.construct();
        System.out.println(textbuilder.getResult());

        HTMLBuilder htmlbuilder = new HTMLBuilder();
        Director directorHTML = new Director(htmlbuilder);
        directorHTML.construct();
        String filename = htmlbuilder.getFilename();
        System.out.println(filename + "文件编写完成。");

        System.out.println("\nMySample");

        MyBuilder myTextBuilder = new MyTextBuilder();
        MyDirector myDirectorText = new MyDirector(myTextBuilder);
        myDirectorText.construct();
        System.out.println(textbuilder.getResult());

    }
}
