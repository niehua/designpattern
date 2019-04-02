package com.ynh.designpattern.decorator;

import com.ynh.designpattern.decorator.border.FullBorder;
import com.ynh.designpattern.decorator.border.SideBorder;
import com.ynh.designpattern.decorator.display.Display;
import com.ynh.designpattern.decorator.display.StringDisplay;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 = 
                    new SideBorder(
                        new FullBorder(
                            new FullBorder(
                                new SideBorder(
                                    new FullBorder(
                                        new StringDisplay("你好，世界。")
                                    ),
                                    '*'
                                )
                            )
                        ),
                        '/'
                    );
        b4.show();
    }
}
