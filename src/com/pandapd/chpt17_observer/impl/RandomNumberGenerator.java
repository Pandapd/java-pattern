package com.pandapd.chpt17_observer.impl;

import com.pandapd.chpt17_observer.NumberGenerator;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

    private Random random;
    private int number;

    public RandomNumberGenerator() {
        random = new Random();
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    /**
     * 随机生成20个数字
     */
    @Override
    public void generate() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(20);
            notifyObservers();
        }
    }
}
