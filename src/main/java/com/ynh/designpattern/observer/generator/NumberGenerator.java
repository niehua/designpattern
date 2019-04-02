package com.ynh.designpattern.observer.generator;

/**
 * Created by niehua.yang on 2019/3/12
 * <p>
 * 观察对象
 */

import com.ynh.designpattern.observer.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    /**
     * 保存Observer们
     */
    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {    // 注册Observer
        observers.add(observer);
    }


    public void notifyObservers() {               // 向Observer发送通知
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            Observer o =  it.next();
            o.update(this);
        }
    }

    /**
     * 获取数值
     * @return
     */
    public abstract int getNumber();

    /**
     * 生成数值
     */
    public abstract void execute();
}
