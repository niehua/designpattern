package com.ynh.designpattern.abstractFactory.factory;

/**
 * Created by niehua.yang on 2019/3/6
 * <p>
 * 将关联零件组装成产品
 * 抽象工厂的工作就是将“抽象零件”组装为“抽象产品”
 * 我们并不关心零件的具体实现，而是只关心接口，我们仅使用该接口将零件组装成产品
 *
 * factory包：抽象工厂，零件，产品
 * <p>
 * 实例程序：将带有层次关系的链接集合制作成HTML文件
 * <p>
 * 角色：抽象工厂
 *
 * 优点：增加具体的工厂是非常容易的
 * 缺点：难以增加新的零件，需要修改对所有的工厂进行相应修改
 *
 * newInstance：可以通过Class类实例生成类所表示的类（会调用无参构造器），可能会抛异常，需要try
 */

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            //newInstance()调用无参构造器
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            //err红色字体打印输出
            System.err.println("没有找到 " + classname + "类。");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
