package com.ynh.designpattern.facade;


import com.ynh.designpattern.facade.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {

        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }
}
