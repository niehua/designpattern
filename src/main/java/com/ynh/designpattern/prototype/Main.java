package com.ynh.designpattern.prototype;

import com.ynh.designpattern.prototype.framework.Manager;
import com.ynh.designpattern.prototype.framework.Product;


public class Main {
    public static void main(String[] args) {
        // 准备  注册到map
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);


        // 生成 调用clone方法copy,然后use
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");

        //测试clone出的是一个不一样的实例
        MessageBox p4 = (MessageBox)manager.create("warning box");
        p4.setDecochar('#'); //更改原来实例的数据，如果下面打印和原来一样，那么就是新的实例
        p4.use("Hello, world.");

        Product p5 = manager.create("warning box");//正确
        p5.use("Hello, world.");

    }
}
