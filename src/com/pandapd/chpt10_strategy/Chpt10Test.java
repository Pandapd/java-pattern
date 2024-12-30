package com.pandapd.chpt10_strategy;

import java.util.stream.IntStream;

public class Chpt10Test {
    public static void main(String[] args) {
        /**
         * 创建两位选手比赛1000场
         */
        Player p1 = new Player("王五", new WinningStrategy(441252));
        Player p2 = new Player("赵六", new Probstrategy(32116141));

        int totalCount = 100;
        IntStream.range(0, totalCount).forEach(i -> {
            Hand h1 = p1.nextHand();
            Hand h2 = p2.nextHand();

            if (h1.isStrongerThan(h2)) {
                System.out.print(p1.getName()+"->"+h1.getDesc() + ",");
                System.out.println(p2.getName()+"->"+h2.getDesc());
                System.out.println(p1.getName() + "Win!");
                p1.win();
                p2.lose();
            } else if(h1.isWeakerThan(h2)) {
                System.out.print(p1.getName()+"->"+h1.getDesc() + ",");
                System.out.println(p2.getName()+"->"+h2.getDesc());
                System.out.println(p2.getName() + "Win!");
                p2.win();
                p1.lose();
            } else {
                System.out.print(p1.getName()+"->"+h1.getDesc() + ",");
                System.out.println(p2.getName()+"->"+h2.getDesc());
                System.out.println("+平局+");
                p1.even();
                p2.even();
            }
        });

        // 数据统计
        System.out.println("++++++++++++++++++++++++");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("++++++++++++++++++++++++");

        Probstrategy strategy = (Probstrategy) p2.getStrategy();
        int[][] history = strategy.getHistory();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+history[i][j]+"]");
            }
            System.out.println("\n");
        }
    }

}
