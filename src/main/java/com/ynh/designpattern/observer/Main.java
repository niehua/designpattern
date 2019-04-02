package com.ynh.designpattern.observer;

import com.ynh.designpattern.observer.generator.NumberGenerator;
import com.ynh.designpattern.observer.generator.RandomNumberGenerator;
import com.ynh.designpattern.observer.observer.DigitObserver;
import com.ynh.designpattern.observer.observer.GraphObserver;
import com.ynh.designpattern.observer.observer.Observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
