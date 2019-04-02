package com.ynh.designpattern.builder.mySample;


/**
 * Created by niehua.yang on 2019/3/7
 */

public class MyDirector {

    private MyBuilder myBuilder;

    public MyDirector(MyBuilder myBuilder) {
        this.myBuilder = myBuilder;
    }

    public void construct() {
        MyBuilder.builder(myBuilder).makeTitle("Greeting")
                .makeString("从早上至下午")
                .makeItems(new String[]{
                        "早上好。",
                        "下午好。",
                })
                .makeString("晚上")
                .makeItems(new String[]{
                        "晚上好。",
                        "晚安。",
                        "再见。",
                })
                .close();
    }
}
