package com.ynh.designpattern.proxy;

import com.ynh.designpattern.proxy.printer.Printable;
import com.ynh.designpattern.proxy.printer.PrinterProxy;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.print("Hello, world.");
    }
}
