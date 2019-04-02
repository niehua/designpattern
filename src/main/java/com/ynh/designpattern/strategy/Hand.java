package com.ynh.designpattern.strategy;

/**
 * Created by niehua.yang on 2019/3/6
 * <p>
 * 手势
 */


public class Hand {

    public static HandValueEnum getHand(int handvalue) { // 根据手势的值获取其对应的实例
        return HandValueEnum.getHandvalueGuuByCode(handvalue);
    }

    public static boolean isStrongerThan(HandValueEnum h1, HandValueEnum h2) {     // 如果this胜了h则返回true
        return fight(h1, h2) == 1;
    }

    private static int fight(HandValueEnum h1, HandValueEnum h2) {                 // 计分：平0, 胜1, 负-1
        if (h1.getCode() == h2.getCode()) {
            return 0;
        } else if ((h1.getCode() + 1) % 3 == h2.getCode()) {
            return 1;
        } else {
            return -1;
        }
    }

}
