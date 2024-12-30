package com.pandapd.chpt10_strategy;

import java.util.Random;

/**
 * 保持上局获胜的手势，否则使用随机的手势
 */
public class WinningStrategy extends Strategy{
    // 保存上局比赛的结果，true-胜出，false-失败
    private boolean won;
    private Hand prevHand;

    // 如果猜拳多次，最好不要每次都new Random对象
    private Random random;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public void study(boolean win) {
        this.won = win;
    }

    @Override
    public Hand nextHand() {
        if (!this.won) {
            prevHand = Hand.getHand(this.random.nextInt(3));
        }
        return prevHand;
    }
}
