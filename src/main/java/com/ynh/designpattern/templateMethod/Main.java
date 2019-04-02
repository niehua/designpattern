package com.ynh.designpattern.templateMethod;


/**
 * Created by niehua.yang on 2019/3/6
 *
 * 实际的程序行为取决于CharDisplay类和StringDisplay类的具体实现
 *
 * 父类类型变量保存子类实例的优点：即使没用instanceof等指定子类，程序也能正常工作
 * 无论保存哪个子类的实例，程序都可工作，即里氏替换原则
 */

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d3 = new StringDisplay("你好，世界。");
        d1.display();
        d2.display();
        d3.display();

        System.out.println("Hello ".length());//5 + 1 = 6   1是空格
        System.out.println("Hello ".getBytes().length);//5 + 1 = 6

        System.out.println("你好，世界。".length());//6
        System.out.println("你好，世界。".getBytes().length);//18
        System.out.println("你好".getBytes().length);//6  中文3字节
        System.out.println("。".getBytes().length);//3  中文3字节

    }
}
