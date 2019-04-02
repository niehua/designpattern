package com.ynh.designpattern.builder.originSample;

/**
 * Created by niehua.yang on 2019/3/6
 * <p>
 * 面向对象编程：“谁知道什么”
 * 因为调用的全是父类Builder的方法，，只有不知道才能替换，正式因为可以替换，组件才具有高价值。
 *
 *
 * 角色：监工
 */

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");              // 标题
        builder.makeString("从早上至下午");         // 字符串
        builder.makeItems(new String[]{             // 条目
                "早上好。",
                "下午好。",
        });
        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "晚上好。",
                "晚安。",
                "再见。",
        });
        builder.close();                            // 完成文档
    }
}
