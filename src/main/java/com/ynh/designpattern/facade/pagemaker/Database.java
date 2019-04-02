package com.ynh.designpattern.facade.pagemaker;

/**
 * Created by niehua.yang on 2019/3/11
 * <p>
 * 使用相对路径，这时用类加载器加载文件路径
 * <p>
 * 其他角色
 */


import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database() {    // 防止外部new出Database的实例，所以声明为private方法
    }

    public static Properties getProperties(String dbname) { // 根据数据库名获取Properties
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(Database.class.getClassLoader().getResourceAsStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
