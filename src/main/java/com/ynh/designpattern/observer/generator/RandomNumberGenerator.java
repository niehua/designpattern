package com.ynh.designpattern.observer.generator;

/**
 * Created by niehua.yang on 2019/3/12
 * <p>
 * 具体的观察对象
 */


import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

    /**
     * 随机数生成器
     */
    private Random random = new Random();
    /**
     * 当前数值
     */
    private int number;

    @Override
    public int getNumber() {                // 获取当前数值
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
