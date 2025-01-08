package com.pandapd.chpt18_memento.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 快照类，保存当前的Gamer状态
 *
 * 注意这个“快照”只保存“好吃的”水果
 */
public class Memento implements Serializable {
    private static final long serialVersionUID = 5782855669967839878L;
    private int money;
    private ArrayList<String> fruits;
    /**
     * 只有在同一个game包中才能保存快照对象
     */
    Memento(int money) {
        this.money = money;
        fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    List getFruit() {
        return (ArrayList)fruits.clone();
    }

    public void addFruit(String f) {
        fruits.add(f);
    }
}
