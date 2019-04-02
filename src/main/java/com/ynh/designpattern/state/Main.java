package com.ynh.designpattern.state;

public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("state Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                // 设置时间
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
