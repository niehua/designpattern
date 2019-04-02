package com.ynh.designpattern.memento;

/**
 * @author niehua.yang
 * @date 2019/3/6
 *
 * 角色：负责人，它将生成者角色生成的Memento角色当作一个黑盒子保存起来
 *
 * 如果使用数组等集合保存Memento实例，就可以实现保存各个时间点的对象状态
 */
import com.ynh.designpattern.memento.game.Gamer;
import com.ynh.designpattern.memento.game.Memento;

public class Main {
    public static void main(String[] args) {
        // 最初的所持金钱数为100
        Gamer gamer = new Gamer(100);
        // 保存最初的状态
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            // 显示掷骰子的次数
            System.out.println("==== " + i);
            // 显示主人公现在的状态
            System.out.println("当前状态:" + gamer);

            gamer.bet();    // 进行游戏

            System.out.println("所持金钱为" + gamer.getMoney() + "元。");

            // 决定如何处理Memento
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    （所持金钱增加了许多，因此保存游戏当前的状态）");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    （所持金钱减少了许多，因此将游戏恢复至以前的状态）");
                gamer.restoreMemento(memento);
            }

            // 等待一段时间
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }
}
