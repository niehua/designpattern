package com.ynh.designpattern.proxy.printer;

/**
 * Created by niehua.yang on 2019/3/12
 *
 * 模式的核心
 *
 * 代理人
 */


public class PrinterProxy implements Printable {
    private String name;
    /**
     * “本人”
     */
    private Printer real;


    public PrinterProxy(String name) {      // 构造函数
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {    // 获取名字
        return name;
    }

    @Override
    public void print(String string) {  // 显示
        realize();
        real.print(string);
    }

    private synchronized void realize() {   // 生成“本人”
        if (real == null) {
            real = new Printer(name);
        }
    }
}
