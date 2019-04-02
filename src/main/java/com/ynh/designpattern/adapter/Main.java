package com.ynh.designpattern.adapter;

import com.ynh.designpattern.adapter.classExtends.PrintBanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("classExtends");
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        System.out.println("objectEntrust");
        Print p2 = new com.ynh.designpattern.adapter.objectEntrust.PrintBanner("Hello");
        p2.printWeak();
        p2.printStrong();
    }
}
