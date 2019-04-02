package com.ynh.designpattern.observer.observer;

import com.ynh.designpattern.observer.generator.NumberGenerator;

public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
