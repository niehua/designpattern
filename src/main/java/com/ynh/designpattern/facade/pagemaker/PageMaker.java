package com.ynh.designpattern.facade.pagemaker;

/**
 * Created by niehua.yang on 2019/3/11
 *
 * 简单窗口，在调用大型程序时，我们需要注意那些数量庞大的类之间错综复杂的关系，不如为这个程序准备一个“窗口”
 * 即互相关联在一起的错综复杂的类整理出高层接口，使接口变少了
 *
 * 能够是接口（api）变少的模式，与外部调用关系弱化，组件更容易被复用
 *
 * 实例程序：web页面
 *
 * 角色：窗口
 *
 * 情景：“啊，在调用那个类之前需要先调用这个类。在调用那个方法之前需要先在这个类中注册一下”
 *
 * 相关设计模式：
 *       1、Abstract Factory模式：可以将Abstract Factory模式看作生成复杂实例时的Facade模式。
 *                              因为他提供了“想要生成这个实例只需要调用这个方法就ok了”的简单接口
 *       2、Mediator模式：Mediator角色作为Colleague角色间的仲裁者负责调停。可以说Facade模式是单向的，而Mediator角色是双向的
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {   // 防止外部new出PageMaker的实例，所以声明为private方法
    }
    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph("欢迎来到" + username + "的主页。");
            writer.paragraph("等着你的邮件哦！");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
