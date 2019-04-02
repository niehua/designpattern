package com.ynh.designpattern.memento.game;

/**
 * @author niehua.yang
 * @date 2019/3/12
 * <p>
 * 保持对象状态，它会将某个时间的实例的状态保存下来，之后有必要时，再将恢复至当时的状态（类似文本撤销功能）
 * 想恢复实例，需要一个可以自由访问实例内部结构的权限。但是，可能导致代码写在各个地方，难以维护，破坏“封装性”
 * Memento有纪念品，备忘物的意思，它事先将某个时间点的实例保存下来，之后在有必要时，再将实例恢复至当时的状态
 *
 * 实例程序：收集水果和获取金钱数的掷骰子游戏
 *          规则：
 *              1、游戏是自动进行的
 *              2、游戏的主人公通过掷骰子来决定下一个状态
 *              3、当骰子点数为1时，主人公金钱增加
 *              4、当骰子点数为2时，主人公金钱减少
 *              5、当骰子点数为6时，主人公获得水果
 *              6、主人公没有钱时游戏结束
 *
 *              保存的状态使：金钱和水果
 * <p>
 * 角色：纪念品
 *
 * 相关设计模式：
 *       1、Protype模式：会生成一个与当前实例完全相同的另外一个实例，而Memento模式只恢复状态时的那部分信息
 *       2、State模式：是用“类”表示状态，而Memento模式用“实例”
 */

import lombok.Getter;

import java.util.*;

public class Memento {

    /**
     * 所持金钱
     */
    @Getter
    int money;
    /**
     *  当前获得的水果
     */
    ArrayList<String> fruits;


    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    void addFruit(String fruit) {           // 添加水果(wide interface)
        fruits.add(fruit);
    }

    List getFruits() {
        return (List) fruits.clone();
    }
}
