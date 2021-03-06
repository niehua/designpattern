package com.ynh.designpattern.strategy;

import com.ynh.designpattern.strategy.strategy.ProbStrategy;
import com.ynh.designpattern.strategy.strategy.WinningStrategy;

public class Main {
    public static void main(String[] args) {

        int seed1 = 314;
        int seed2 = 15;
        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        Player player2 = new Player("Hana", new ProbStrategy(seed2));
        for (int i = 0; i < 10000; i++) {
            HandValueEnum nextHand1 = player1.nextHand();
            HandValueEnum nextHand2 = player2.nextHand();
            if (Hand.isStrongerThan(nextHand1, nextHand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if (Hand.isStrongerThan(nextHand2, nextHand1)) {
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
