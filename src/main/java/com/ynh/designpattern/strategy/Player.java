package com.ynh.designpattern.strategy;

import com.ynh.designpattern.strategy.strategy.Strategy;

/**
 * Created by niehua.yang on 2019/3/6
 * <p>
 * 游戏选手
 * <p>
 * 上下文
 */


public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;

    public Player(String name, Strategy strategy) {         // 赋予姓名和策略
        this.name = name;
        this.strategy = strategy;
    }

    public HandValueEnum nextHand() {                                // 策略决定下一局要出的手势
        return strategy.nextHand();
    }

    public void win() {                 // 胜
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    public void lose() {                // 负
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    public void even() {                // 平
        gamecount++;
    }

    public String toString() {
        return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
    }
}
