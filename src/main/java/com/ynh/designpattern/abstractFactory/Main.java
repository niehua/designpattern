package com.ynh.designpattern.abstractFactory;

import com.ynh.designpattern.abstractFactory.factory.Factory;
import com.ynh.designpattern.abstractFactory.factory.Link;
import com.ynh.designpattern.abstractFactory.factory.Page;
import com.ynh.designpattern.abstractFactory.factory.Tray;

/**
 * factory: 包含抽象工厂、零件、产品的包
 * <p>
 * listfactory: 包含具体的工厂、零件、产品
 * <p>
 * System.exit(0); 与 return； 区别：
 * 如果在main方法中没有区别，都是终止程序。
 * 其他场合就有区别
 */

public class Main {
    public static void main(String[] args) {

        Factory factory = null;
        for (int i = 0; i < 1; i++) {
            factory = i == 0 ? Factory.getFactory("com.ynh.designpattern.abstractFactory.listfactory.ListFactory")
                    : Factory.getFactory("com.ynh.designpattern.abstractFactory.tablefactory.TableFactory");

            Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
            Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

            Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
            Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
            Link excite = factory.createLink("Excite", "http://www.excite.com/");
            Link google = factory.createLink("Google", "http://www.google.com/");

            Tray traynews = factory.createTray("日报");
            traynews.add(people);
            traynews.add(gmw);

            Tray trayyahoo = factory.createTray("Yahoo!");
            trayyahoo.add(us_yahoo);
            trayyahoo.add(jp_yahoo);

            Tray traysearch = factory.createTray("检索引擎");
            traysearch.add(trayyahoo);
            traysearch.add(excite);
            traysearch.add(google);

            Page page = factory.createPage("LinkPage", "杨文轩");
            page.add(traynews);
            page.add(traysearch);
            page.output();
        }
    }
}
