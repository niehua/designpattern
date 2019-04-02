package com.ynh.designpattern.builder.mySample;

/**
 * Created by niehua.yang on 2019/3/7
 * <p>
 * 组装复杂的实例
 * <p>
 * 实例程序：编写文档
 * <p>
 * 角色：建造者
 * <p>
 * 用一个内部类使builder出来的实例时不可变的，安全的,这个一般用于创建一个数据库实体
 */

public abstract class MyBuilder {

    public static InnerBuilder builder(MyBuilder myBuilder) {
        return new InnerBuilder(myBuilder);
    }

    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();

    public static class InnerBuilder {
        private MyBuilder target;

        public InnerBuilder(MyBuilder myBuilder) {
            target = myBuilder;
        }

        public InnerBuilder makeTitle(String title) {
            target.makeTitle(title);
            return this;
        }

        public InnerBuilder makeString(String str) {
            target.makeString(str);
            return this;
        }

        public InnerBuilder makeItems(String[] items) {
            target.makeItems(items);
            return this;
        }

        public InnerBuilder close() {
            target.close();
            return this;
        }

        public MyBuilder build() {
            MyBuilder myBuilder = target;
            target = null;
            return myBuilder;
        }
    }

}
