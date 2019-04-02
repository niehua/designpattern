package com.ynh.designpattern.strategy.strategy;

/**
 * Created by niehua.yang on 2019/3/6
 * <p>
 * 第一种策略：如果这一局猜拳获胜，那么下一局也出一样的手势
 * 具体的策略
 */


import com.ynh.designpattern.strategy.Hand;
import com.ynh.designpattern.strategy.HandValueEnum;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private HandValueEnum prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public HandValueEnum nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
