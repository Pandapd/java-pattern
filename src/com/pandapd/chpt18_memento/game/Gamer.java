package com.pandapd.chpt18_memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 掷骰子的玩家
 *
 * 1.自动进行游戏
 * 2.骰子点数为1，金币增加
 * 3.骰子点数为2，金币减少
 * 4.骰子点数为6, 得到水果
 * 5.金币=0结束游戏
 */

public class Gamer {
    private int money;
    private List<String> fruits;
    private Random random;
    private static String[] FRUIT_NAME = {"苹果", "香蕉", "葡萄", "桃子"};

    public Gamer(int money) {
        this.money = money;
        fruits = new ArrayList<>();
        random = new Random();
    }

    public int getMoney() {
        return money;
    }

    /**
     * 投掷骰子
     */
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (1 == dice) {
            money += 100;
            System.out.println("投掷"+dice+", 恭喜，金币+100");
        } else if (2 == dice) {
            money /= 2;
            System.out.println("投掷"+dice+", 惨，金币损失一半..");
        } else if (6 == dice) {

            String f = getRandomFruit();
            System.out.println("投掷"+dice+", 恭喜，获得水果☆" + f+"☆");
            this.fruits.add(f);
        }
    }

    /**
     * 随机返回带前缀“”or“好吃的”的水果字符串
     * @return 水果字符串
     */
    private String getRandomFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + FRUIT_NAME[random.nextInt(FRUIT_NAME.length)];
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }

    // =========================
    /**
     * 生成Memento
     * */
    public Memento createMemento() {
        Memento m = new Memento(money);
        for (String f: this.fruits) {
            if (f.startsWith("好吃的")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        fruits = memento.getFruit();
    }

    /**
     * 恢复Memento
     *
     */
}
